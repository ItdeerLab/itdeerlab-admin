package cn.itdeer.modules.admin.system.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

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
public class ExceptionRecord  implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    @Column(name = "id",columnDefinition="varchar(50) COMMENT 'ID'")
    private String id;

    @Basic
    @Column(name = "time",columnDefinition="INTEGER COMMENT '日志记录时间'")
    private Long time;

    @Basic
    @Column(name = "request_method",columnDefinition="varchar(20) COMMENT '请求的方法(Get Post Put等)'")
    private String requestMethod;

    @Basic
    @Column(name = "access_method",columnDefinition="varchar(50) COMMENT '请求系统的方法(提供请求的方法)'")
    private String accessMethod;

    @Basic
    @Column(name = "url",columnDefinition="varchar(100) COMMENT '请求地址'")
    private String url;

    @Basic
    @Column(name = "ip",columnDefinition="varchar(50) COMMENT '请求者IP'")
    private String ip;

    @Basic
    @Column(name = "type",columnDefinition="varchar(50) COMMENT '请求类型（RestAPI,通常API）'")
    private String type;

    @Basic
    @Column(name = "status",columnDefinition="varchar(10) COMMENT '日志状态'")
    private String status;

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
