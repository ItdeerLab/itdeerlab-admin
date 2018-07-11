package cn.itdeer.modules.admin.blog.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 * Description : 博客管理(Article文章)实体类
 * PackageName : cn.itdeer.modules.admin.blog.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午9:54
 */

@Data
@Entity
@ToString
@Table(name = "blog_article")
public class Article extends BaseEntity {

    @Basic
    @Column(name = "title",columnDefinition="varchar(50) COMMENT '文章标题'")
    private String title;

    @Basic
    @Column(name = "text_content",columnDefinition="TEXT COMMENT 'TEXT内容'")
    private String textContent;

    @Basic
    @Column(name = "html_content",columnDefinition="TEXT COMMENT 'HTML内容'")
    private String htmlContent;

    @Basic
    @Column(name = "release_date",columnDefinition="INTEGER COMMENT '发布时间'")
    private Long releaseDate;

    @Basic
    @Column(name = "release_state",columnDefinition="BIT COMMENT '发布状态'")
    private Boolean releaseState;

    @Basic
    @Column(name = "if_comment",columnDefinition="BIT COMMENT '是否允许评论'")
    private Boolean ifComment;

    @Basic
    @Column(name = "user_id",columnDefinition="varchar(50) COMMENT '用户ID'")
    private String userId;

    @Basic
    @Column(name = "user_name",columnDefinition="varchar(50) COMMENT '用户名称'")
    private String userName;

    @Basic
    @Column(name = "picture_id",columnDefinition="varchar(50) COMMENT '封面图片ID'")
    private String pictureId;

    @Basic
    @Column(name = "picture_url",columnDefinition="varchar(100) COMMENT '封面图片地址'")
    private String pictureUrl;

    @Basic
    @Column(name = "comment_num",columnDefinition="INTEGER COMMENT '评论数'")
    private Integer commentNum;

    @Basic
    @Column(name = "hits",columnDefinition="INTEGER COMMENT '点击数'")
    private Integer hits;

    @Basic
    @Column(name = "type",columnDefinition="varchar(50) COMMENT '文章类型'")
    private String type;

    @Basic
    @Column(name = "category",columnDefinition="varchar(50) COMMENT '文章类别'")
    private String category;

    @Basic
    @Column(name = "tags",columnDefinition="varchar(200) COMMENT '文章标签'")
    private String tags;
}
