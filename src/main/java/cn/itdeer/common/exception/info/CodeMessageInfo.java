package cn.itdeer.common.exception.info;

import lombok.Getter;

/**
 * Description :
 * PackageName : cn.itdeer.common.exception.info
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-5/上午10:46
 */

@Getter
public enum CodeMessageInfo {

    PARAMETER_IS_EMPTY(4,"参数为空!","Parameter is null"),
    API_NOT_EXIST(5,"接口不存在","Interface does not exist"),
    FILE_NOT_FOUNT(6,"资源不存在","Resources don't exist"),
    UNKOWN_ERROR(7,"系统未知错误","System unknown error"),

    DELETE_SUCCESS(8,"删除成功","Delete success"),
    DELETE_FAIL(9,"删除失败","Delete fail"),
    SAVE_SUCCESS(10,"保存成功","Save success"),
    SAVE_FAIL(11,"保存失败","Save fail"),
    ;

    private Integer code;
    private String msg;
    private String error;

    CodeMessageInfo(Integer code, String msg, String error) {
        this.code = code;
        this.msg = msg;
        this.error = error;
    }

}
