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
    @Column(name = "id",columnDefinition = BaseExplain.BASE_ID)
    private String id;

    @Basic
    @Column(name = "create_time",columnDefinition = BaseExplain.BASE_CREATE_TIME)
    private Long createTime;

    @Basic
    @Column(name = "update_time",columnDefinition = BaseExplain.BASE_UPDATE_TIME)
    private Long updateTime;

    @Basic
    @Column(name = "remarks",columnDefinition = BaseExplain.BASE_REMARKS)
    private String remarks;
}
