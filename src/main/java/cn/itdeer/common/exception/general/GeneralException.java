package cn.itdeer.common.exception.general;

import cn.itdeer.common.exception.info.CodeMessageInfo;
import lombok.Getter;

/**
 * Description : 自定义应用异常类
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午6:07
 */

@Getter
public class GeneralException extends RuntimeException{

    private Integer code;
    private String message;
    private String error;


    /**
     * 系统默认处理构造函数
     * @param message 消息提示
     */
    public GeneralException(String message) {
        super(message);
    }

    /**
     * 系统自定义枚举参数异常处理构造函数
     * @param codeMessageInfo 枚举类型请求状态和信息
     */
    public GeneralException(CodeMessageInfo codeMessageInfo) {
        super();
        this.code = codeMessageInfo.getCode();
        this.message = codeMessageInfo.getMsg();
        this.error = codeMessageInfo.getError();
    }

    /**
     * 系统自定义枚举参数异常处理构造函数
     * @param message 消息提示
     * @param codeMessageInfo 枚举类型请求状态和信息
     */
    public GeneralException(String message,CodeMessageInfo codeMessageInfo) {
        super();
        this.code = codeMessageInfo.getCode();
        this.message = message + " " + codeMessageInfo.getMsg();
        this.error = codeMessageInfo.getError();
    }

}
