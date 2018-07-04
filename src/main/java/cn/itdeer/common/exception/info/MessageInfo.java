package cn.itdeer.common.exception.info;

/**
 * Description : 枚举类型消息定义
 * PackageName : cn.itdeer.common.exception.info
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午6:19
 */

public enum MessageInfo {

    API_NOT_EXIST("API接口不存在"),

    FILE_NOT_FOUND("文件资源不存在"),

    UNKOWN_ERROR("系统未知错误"),

    DELETE_SUCCESS("删除成功"),
    DELETE_FAIL("删除失败"),

    SAVE_SUCCESS("保存成功"),
    SAVE_FAIL("保存失败"),
    ;

    private String msg;

    /**
     * 两个参数构造函数
     * @param msg 返回枚举信息
     */
    MessageInfo(String msg) {
        this.msg = msg;
    }

    /**
     * 获取枚举信息
     * @return 返回枚举信息Msg
     */
    public String getMsg(){
        return msg;
    }

}
