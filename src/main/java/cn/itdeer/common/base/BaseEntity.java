package cn.itdeer.common.base;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Description : 基础Entity
 * PackageName : cn.itdeer.common.base
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/13/22:01
 */

@Data
@ToString
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy="uuid")
    @Column(name = "id",columnDefinition="varchar(50) COMMENT 'ID编号'")
    private String id;

    @Basic
    @Column(name = "create_time",columnDefinition="INTEGER COMMENT '创建时间'")
    private Long createTime;

    @Basic
    @Column(name = "update_time",columnDefinition="INTEGER COMMENT '更新时间'")
    private Long updateTime;

    @Basic
    @Column(name = "remarks",columnDefinition="varchar(200) COMMENT '描述'")
    private String remarks;
}
