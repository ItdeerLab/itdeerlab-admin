package cn.itdeer.common.exception.info;

/**
 * Description : 枚举类型的状态码
 * PackageName : cn.itdeer.common.exception.info
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/4/22:35
 */
public enum CodeInfo {

    DELETE_FAIL(1),
    SAVE_FAIL(2),
    SAVE_SUCCESS(3)
    ;

    /**
     * 状态码
     */
    private Integer code;

    CodeInfo(Integer code) {
        this.code = code;
    }

    /**
     * 获取状态码
     * @return 返回状态码
     */
    public Integer getCode(){
        return code;
    }

}
