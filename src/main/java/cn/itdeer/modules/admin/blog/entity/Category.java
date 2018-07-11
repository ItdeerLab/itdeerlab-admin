package cn.itdeer.modules.admin.blog.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 * Description : 博客管理(Category分类)实体类
 * PackageName : cn.itdeer.modules.admin.blog.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午10:00
 */

@Data
@Entity
@ToString
@Table(name = "blog_category")
public class Category extends BaseEntity{

    @Basic
    @Column(name = "name",columnDefinition="varchar(20) COMMENT '类别名称'")
    private String name;

    @Basic
    @Column(name = "user_id",columnDefinition="varchar(50) COMMENT '用户ID'")
    private String userId;

    @Basic
    @Column(name = "user_name",columnDefinition="varchar(50) COMMENT '用户名称'")
    private String userName;

    @Basic
    @Column(name = "description",columnDefinition="varchar(50) COMMENT '描述'")
    private String description;
}
