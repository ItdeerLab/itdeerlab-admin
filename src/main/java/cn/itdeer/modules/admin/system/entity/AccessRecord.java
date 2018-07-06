package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Description : 系统管理(访问记录)实体类
 * PackageName : cn.itdeer.modules.admin.system.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/6/22:31
 */

@Data
@Entity
@ToString
@Table(name = "system_accessrecord")
public class AccessRecord extends BaseEntity{

    @Column(name = "access_url")
    private String url;

    @Column(name = "access_http_method")
    private String httpMethod;

    @Column(name = "access_ip")
    private String ip;

    @Column(name = "access_class_method")
    private String classMethod;

    @Column(name = "access_args")
    private String args;

    @Column(name = "access_time")
    private Long time;

    /**
     * 全部参数的构造函数，方便使用
     * @param url 请求URL
     * @param httpMethod 请求方式
     * @param ip 请求IP
     * @param classMethod 访问的方法
     * @param args  请求参数
     * @param time  请求时间
     */
    public AccessRecord(String url, String httpMethod, String ip, String classMethod, String args, Long time) {
        this.url = url;
        this.httpMethod = httpMethod;
        this.ip = ip;
        this.classMethod = classMethod;
        this.args = args;
        this.time = time;
    }
}
