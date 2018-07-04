package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.system.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:07
 */

@Data
@Entity
@ToString
@Table(name = "system_log")
public class Log extends BaseEntity{

    @Column(name = "log_time")
    private Long time;                            //所属

    @Column(name = "log_requestmethod")
    private String requestMethod;                        //关键词

    @Column(name = "log_accessmethod")
    private String accessMethod;                        //关键词

    @Column(name = "log_url")
    private String url;                     //描述

    @Column(name = "log_ip")
    private String ip;                       //ico图片ID

    @Column(name = "log_args")
    private String args;                      //ico图片地址

}
