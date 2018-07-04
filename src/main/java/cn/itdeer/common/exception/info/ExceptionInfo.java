package cn.itdeer.common.exception.info;

import lombok.Data;

/**
 * Description : RestFul风格的API请求异常信息
 * PackageName : cn.itdeer.common.exception.info
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/4/23:54
 */

@Data
public class ExceptionInfo {

    private Integer code;
    private String message;
    private String url;
}
