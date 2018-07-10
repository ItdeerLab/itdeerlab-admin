package cn.itdeer.modules.admin.blog.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Description :
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

    @Column(name = "category_name")
    private String name;                             //类别名称

    @Column(name = "category_createdate")
    private Long createDate = new Date().getTime();  //创建时间

    @Column(name = "category_editdate")
    private Long editDate;                          //修改时间

    @Column(name = "category_userid")
    private String userId;                          //用户ID

    @Column(name = "category_username")
    private String userName;                        //用户名称

    @Column(name = "category_description")
    private String description;                     //描述
}
