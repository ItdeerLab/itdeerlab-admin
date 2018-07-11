package cn.itdeer.modules.admin.blog.entity;

import cn.itdeer.common.base.BaseEntity;
import cn.itdeer.common.base.BaseExplain;
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
    @Column(name = "name",columnDefinition = BaseExplain.CATEGORY_NAME)
    private String name;

    @Basic
    @Column(name = "user_id",columnDefinition = BaseExplain.CATEGORY_USER_ID)
    private String userId;

    @Basic
    @Column(name = "user_name",columnDefinition = BaseExplain.CATEGORY_USER_NAME)
    private String userName;

}
