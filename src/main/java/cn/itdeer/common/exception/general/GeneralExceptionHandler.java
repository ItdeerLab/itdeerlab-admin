package cn.itdeer.common.exception.general;

import cn.itdeer.common.base.BaseStatus;
import cn.itdeer.common.exception.info.ExceptionInfo;
import cn.itdeer.modules.admin.system.entity.Log;
import cn.itdeer.modules.admin.system.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Description : 全局异常处理工具类
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午5:15
 */

@Slf4j
@ControllerAdvice
public class GeneralExceptionHandler {

    @Autowired
    private LogService logService;

    private ExceptionInfo exceptionInfo;

    /**
     * GeneralException异常的全局处理方式
     * @param hsr 请求Request
     * @param ge GeneralException异常
     * @return ExceptionInfo 对象
     */
    @ResponseBody
    @ExceptionHandler(value = GeneralException.class)
    public ExceptionInfo generalHandler(HttpServletRequest hsr, GeneralException ge) {
        exceptionInfo = new ExceptionInfo();
        exceptionInfo.setCode(ge.getCode());
        exceptionInfo.setMessage(ge.getMessage());
        exceptionInfo.setError(ge.getError());
        exceptionInfo.setUrl(hsr.getRequestURI());

        log.error("GeneralExceptionHandler:    Request Status: {}    Request Host: {}    Request Url: {}    Error Message: {}    Time: {}", ge.getCode(), hsr.getRemoteHost(), hsr.getRequestURI(), ge.getMessage(), exceptionInfo.getTime());
        //日志入库
        //TODO

        Log log = new Log();
        log.setTime(exceptionInfo.getTime());
        log.setIp(hsr.getRemoteHost());
        log.setAccessMethod(hsr.getRequestURI());
        log.setRequestMethod(hsr.getMethod());
        log.setStatus(BaseStatus.ERROR.toString());
        log.setUrl(hsr.getRequestURL().toString());
        logService.save(log);

        System.out.println(hsr.getMethod());    //GET
        System.out.println(hsr.getRequestURI()); // /admin/user/list
        System.out.println(hsr.getAuthType());
        System.out.println(hsr.getContextPath());
        System.out.println(hsr.getPathInfo());
        System.out.println(hsr.getRemoteHost());    //192.168.1.67
        System.out.println(hsr.getServletPath()); // /admin/user/list
        System.out.println(hsr.getQueryString());
        System.out.println(hsr.getRequestURL());        //http://172.24.4.238:8080/admin/user/list


        return exceptionInfo;
    }

    /**
     * 默认Exception异常的全局处理方式
     * @param hsr 请求Request
     * @param e Exception类型异常
     * @return ExceptionInfo 对象
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ExceptionInfo defaultHandler(HttpServletRequest hsr, Exception e) {
        exceptionInfo = new ExceptionInfo();
        exceptionInfo.setMessage(e.getMessage());
        exceptionInfo.setUrl(hsr.getRequestURI());

        log.error("ExceptionHandler Host: {} Invokes Url: {} Error: {}" + hsr.getRemoteHost() + hsr.getRequestURI() + e.getMessage());

        return exceptionInfo;
    }
}
