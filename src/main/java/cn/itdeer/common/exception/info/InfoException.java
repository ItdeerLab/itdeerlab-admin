package cn.itdeer.common.exception.info;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Description : 异常详细信息定义
 * PackageName : cn.itdeer.common.exception.info
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午6:19
 */

public enum InfoException {

    API_NOT_EXIST(1,"API接口不存在"),
    FILE_NOT_FOUND(0,"文件资源不存在"),
    UNKOWN_ERROR(-1,"系统未知错误");

    private int code;
    private String msg;

    /**
     * 两个参数构造函数
     * @param code 错误代码
     * @param msg 错误信息
     */
    InfoException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取错误信息
     * @return 返回错误code和错误信息msg
     */
    @JsonValue
    public String getInfoCodeMsg(){
        return "error_code:" + code + " error_msg:" + msg;
    }

}
