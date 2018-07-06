package cn.itdeer.common.exception.general;

import cn.itdeer.common.base.BaseStatus;
import cn.itdeer.common.exception.info.ExceptionInfo;
import cn.itdeer.modules.admin.system.entity.ExceptionRecord;
import cn.itdeer.modules.admin.system.service.ExceptionRecordService;
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
    private ExceptionRecordService logService;

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

        ExceptionRecord exceptionRecord = new ExceptionRecord(
                exceptionInfo.getTime(),
                hsr.getMethod(),
                hsr.getRequestURI(),
                hsr.getRequestURL().toString(),
                hsr.getRemoteHost(),
                BaseStatus.GENERAL.toString(),
                BaseStatus.ERROR.toString()
                );
        logService.save(exceptionRecord);

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
