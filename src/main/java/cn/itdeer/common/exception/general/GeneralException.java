package cn.itdeer.common.exception.general;

/**
 * Description : 自定义应用异常类
 * PackageName : cn.itdeer.common.exception
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午6:07
 */

public class GeneralException extends RuntimeException{

    private Integer code;

    public GeneralException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }
}
