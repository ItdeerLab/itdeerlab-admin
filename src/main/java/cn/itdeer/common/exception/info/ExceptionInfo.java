package cn.itdeer.common.exception.info;

import lombok.Data;

import java.util.Date;

/**
 * Description : RestFul风格的API请求异常信息
 * PackageName : cn.itdeer.common.exception.info
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/4/23:54
 */

@Data
public class ExceptionInfo {

    private Integer code;                       //异常代码
    private Long time = new Date().getTime();   //发送异常的时间
    private String message;                     //异常消息
    private String error;                       //错误信息
    private String url;                         //访问的URL

}
