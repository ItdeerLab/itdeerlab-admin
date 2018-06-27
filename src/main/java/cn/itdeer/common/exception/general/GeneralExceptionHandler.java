package cn.itdeer.common.exception.general;

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


    /**
     * GeneralException异常的全局处理方式
     * @param req 请求Request
     * @param ge GeneralException异常
     * @return GeneralExceptionInfo 对象
     */
    @ExceptionHandler(value = GeneralException.class)
    public GeneralExceptionInfo errorHandler(HttpServletRequest req, GeneralException ge) {
        GeneralExceptionInfo generalExceptionInfo = new GeneralExceptionInfo();
        log.error("");
        return generalExceptionInfo;
    }

    /**
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        log.error("DefaultException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }
}
