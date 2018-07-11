package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseExplain;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

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
public class AccessRecord implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    @Column(name = "id",columnDefinition = BaseExplain.ACCESS_RECORD_ID)
    private String id;

    @Basic
    @Column(name = "url",columnDefinition = BaseExplain.ACCESS_RECORD_URL)
    private String url;

    @Basic
    @Column(name = "http_method",columnDefinition = BaseExplain.ACCESS_RECORD_HTTP_METHOD)
    private String httpMethod;

    @Basic
    @Column(name = "ip",columnDefinition = BaseExplain.ACCESS_RECORD_IP)
    private String ip;

    @Basic
    @Column(name = "class_method",columnDefinition = BaseExplain.ACCESS_RECORD_CLASS_METHOD)
    private String classMethod;

    @Basic
    @Column(name = "args",columnDefinition = BaseExplain.ACCESS_RECORD_ARGS)
    private String args;

    @Basic
    @Column(name = "time",columnDefinition = BaseExplain.ACCESS_RECORD_TIME)
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
