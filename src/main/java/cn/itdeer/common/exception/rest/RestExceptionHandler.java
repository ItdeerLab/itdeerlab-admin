package cn.itdeer.common.exception.rest;

import cn.itdeer.common.exception.info.ExceptionInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Description : RestAPI请求的全局异常处理类 (当发生RestFul风格的请求发生异常时,把需要返回给调用者的信息做封装,以一定的方式返回给调用者)
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午5:42
 */

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    private ExceptionInfo exceptionInfo;

    /**
     * 返回JSON类型的异常信息
     * @param hsr 请求Request
     * @param re 抛出的异常
     * @return ExceptionInfo 对象
     */
    @ResponseBody
    @ExceptionHandler(value = RestException.class)
    public ExceptionInfo json(HttpServletRequest hsr, RestException re){

        exceptionInfo = new ExceptionInfo();
        exceptionInfo.setCode(re.getCode());
        exceptionInfo.setMessage(re.getMessage());
        exceptionInfo.setUrl(hsr.getRequestURI());

        log.error("RestExceptionHandler:    Request Status: {}    Request Host: {}    Request Url: {}    Error Message: {}    Time: {}", re.getCode(), hsr.getRemoteHost(), hsr.getRequestURI(), re.getMessage(), exceptionInfo.getTime());

        return exceptionInfo;
    }

}
