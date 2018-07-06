package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description : 系统管理(异常记录)实体类
 * PackageName : cn.itdeer.modules.admin.system.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:07
 */

@Data
@Entity
@ToString
@Table(name = "system_exceptionrecord")
public class ExceptionRecord extends BaseEntity{

    @Column(name = "exception_time")
    private Long time;                            //日志记录时间

    @Column(name = "exception_requestmethod")
    private String requestMethod;                 //请求的方法(Get Post Put等)

    @Column(name = "exception_accessmethod")
    private String accessMethod;                  //请求系统的方法(提供请求的方法)

    @Column(name = "exception_url")
    private String url;                           //请求地址

    @Column(name = "exception_ip")
    private String ip;                            //请求者IP

    @Column(name = "exception_type")
    private String type;                          //请求类型（RestAPI,通常API）

    @Column(name = "exception_status")
    private String status;                        //日志状态

    /**
     * 全部参数的构造函数，方便记录添加
     * @param time 异常记录时间
     * @param requestMethod 请求访问方式
     * @param accessMethod 请求的方法
     * @param url 请求的URL
     * @param ip 请求IP
     * @param type 请求类型
     * @param status 请求状态
     */
    public ExceptionRecord(Long time, String requestMethod, String accessMethod, String url, String ip, String type, String status) {
        this.time = time;
        this.requestMethod = requestMethod;
        this.accessMethod = accessMethod;
        this.url = url;
        this.ip = ip;
        this.type = type;
        this.status = status;
    }
}
