package cn.itdeer.common.exception.rest;

import cn.itdeer.common.exception.info.CodeMessageInfo;
import lombok.Getter;

/**
 * Description : 自定义RestFul风格异常类
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午5:49
 */

@Getter
public class RestException extends RuntimeException{

    private Integer code;
    private String message;
    private String error;

    /**
     * API异常默认处理构造函数
     * @param message 消息提示
     */
    public RestException(String message) {
        super(message);
    }

    /**
     * API自定义枚举参数异常处理构造函数
     * @param codeMessageInfo 枚举类型请求状态和信息
     */
    public RestException(CodeMessageInfo codeMessageInfo) {
        super();
        this.code = codeMessageInfo.getCode();
        this.message = codeMessageInfo.getMsg();
        this.error = codeMessageInfo.getError();
    }

    /**
     * API自定义枚举参数异常处理构造函数
     * @param message 消息提示
     * @param codeMessageInfo 枚举类型请求状态和信息
     */
    public RestException(String message,CodeMessageInfo codeMessageInfo) {
        super();
        this.code = codeMessageInfo.getCode();
        this.message = message + " " + codeMessageInfo.getMsg();
        this.error = codeMessageInfo.getError();
    }
}
