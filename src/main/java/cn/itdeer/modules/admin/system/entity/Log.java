package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description : 系统管理(Log日志)实体类
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
    private Long time;                            //日志记录时间

    @Column(name = "log_requestmethod")
    private String requestMethod;                 //请求的方法(Get Post Put等)

    @Column(name = "log_accessmethod")
    private String accessMethod;                  //请求系统的方法(提供请求的方法)

    @Column(name = "log_url")
    private String url;                           //请求地址

    @Column(name = "log_ip")
    private String ip;                            //请求者IP

    @Column(name = "log_args")
    private String args;                          //请求参数

    @Column(name = "log_status")
    private String status;                        //日志状态

}
