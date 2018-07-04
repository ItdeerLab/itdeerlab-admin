package cn.itdeer.common.exception.rest;

/**
 * Description : 自定义RestFul风格异常类
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午5:49
 */

public class RestException extends RuntimeException{

    private Integer code;

    public RestException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }
}
