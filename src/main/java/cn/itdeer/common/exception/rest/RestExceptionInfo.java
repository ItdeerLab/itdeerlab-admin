package cn.itdeer.common.exception.rest;

/**
 * Description : RestFul风格的API请求异常信息
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午5:47
 */
public class RestExceptionInfo {

    public static final Integer OK = 0;
    public static final Integer EXCEPTION = 100;

    private Integer code;
    private String message;
    private String url;

}
