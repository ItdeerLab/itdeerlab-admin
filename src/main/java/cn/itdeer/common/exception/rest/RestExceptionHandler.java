package cn.itdeer.common.exception.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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


    @ResponseBody
    @ExceptionHandler(value = RestException.class)
    public void json(){

    }

}
