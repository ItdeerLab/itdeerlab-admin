package cn.itdeer.common.message;

import lombok.Getter;

/**
 * Description : 系统消息提示基础类
 * PackageName : cn.itdeer.common.message
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午2:13
 */


@Getter
public enum Message {

    METAS_SAVE_SUCCESS("页面配置信息保存成功","执行成功！","success"),
    METAS_DELETE_FAIL("页面配置信息删除失败","执行失败！","error"),
    THEMES_SAVE_SUCCESS("主题信息保存成功","执行成功！","success"),
    THEMES_DELETE_FAIL("主题信息删除失败","执行失败","error")
    ;

    private String title;
    private String message;
    private String type;


    Message(String title, String message, String type) {
        this.title = title;
        this.message = message;
        this.type = type;
    }
}
