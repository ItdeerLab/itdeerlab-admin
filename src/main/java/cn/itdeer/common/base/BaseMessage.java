package cn.itdeer.common.base;

import lombok.Data;

/**
 * Description : 系统消息提示基础类
 * PackageName : cn.itdeer.common.base
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-27/下午2:13
 */

@Data
public class BaseMessage {

    private String title;
    private String message;
    private String type;


    public BaseMessage(String title, String message, String type) {
        this.title = title;
        this.message = message;
        this.type = type;
    }
}
