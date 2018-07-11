package cn.itdeer.modules.admin.blog.entity;

import cn.itdeer.common.base.BaseEntity;
import cn.itdeer.common.base.BaseExplain;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description : 博客管理(Tag标签)实体类
 * PackageName : cn.itdeer.modules.admin.blog.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午9:54
 */

@Data
@Entity
@ToString
@Table(name = "blog_tag")
public class Tag extends BaseEntity {

    @Basic
    @Column(name = "name",columnDefinition = BaseExplain.TAG_NAME)
    private String name;

}
