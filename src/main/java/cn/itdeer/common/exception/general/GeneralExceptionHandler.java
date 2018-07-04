package cn.itdeer.common.exception.general;

import cn.itdeer.common.exception.info.ExceptionInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

    private ExceptionInfo exceptionInfo;

    /**
     * GeneralException异常的全局处理方式
     * @param hsr 请求Request
     * @param ge GeneralException异常
     * @return ExceptionInfo 对象
     */
    @ExceptionHandler(value = GeneralException.class)
    public ExceptionInfo generalHandler(HttpServletRequest hsr, GeneralException ge) {
        exceptionInfo = new ExceptionInfo();
        exceptionInfo.setCode(ge.getCode());
        exceptionInfo.setMessage(ge.getMessage());
        exceptionInfo.setUrl(hsr.getRequestURI());

        log.error("GeneralExceptionHandler Host: {} Invokes Url: {} Error: {}" + hsr.getRemoteHost() + hsr.getRequestURI() + ge.getMessage());

        return exceptionInfo;
    }

    /**
     * 默认Exception异常的全局处理方式
     * @param hsr 请求Request
     * @param e Exception类型异常
     * @return ExceptionInfo 对象
     */
    @ExceptionHandler(value = Exception.class)
    public ExceptionInfo defaultHandler(HttpServletRequest hsr, Exception e) {
        exceptionInfo = new ExceptionInfo();
        exceptionInfo.setMessage(e.getMessage());
        exceptionInfo.setUrl(hsr.getRequestURI());

        log.error("ExceptionHandler Host: {} Invokes Url: {} Error: {}" + hsr.getRemoteHost() + hsr.getRequestURI() + e.getMessage());

        return exceptionInfo;
    }
}
