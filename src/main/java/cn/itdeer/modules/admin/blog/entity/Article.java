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
    @Column(name = "title",columnDefinition = BaseExplain.ARTICLE_TITLE)
    private String title;

    @Basic
    @Column(name = "text_content",columnDefinition = BaseExplain.ARTICLE_TEXT_CONTENT)
    private String textContent;

    @Basic
    @Column(name = "html_content",columnDefinition = BaseExplain.ARTICLE_HTML_CONTENT)
    private String htmlContent;

    @Basic
    @Column(name = "release_date",columnDefinition = BaseExplain.ARTICLE_RELEASE_DATE)
    private Long releaseDate;

    @Basic
    @Column(name = "release_state",columnDefinition = BaseExplain.ARTICLE_RELEASE_STATE)
    private Boolean releaseState;

    @Basic
    @Column(name = "if_comment",columnDefinition = BaseExplain.ARTICLE_IF_COMMENT)
    private Boolean ifComment;

    @Basic
    @Column(name = "user_id",columnDefinition = BaseExplain.ARTICLE_USER_ID)
    private String userId;

    @Basic
    @Column(name = "user_name",columnDefinition = BaseExplain.ARTICLE_USER_NAME)
    private String userName;

    @Basic
    @Column(name = "picture_id",columnDefinition = BaseExplain.ARTICLE_PICTURE_ID)
    private String pictureId;

    @Basic
    @Column(name = "picture_url",columnDefinition = BaseExplain.ARTICLE_PICTURE_URL)
    private String pictureUrl;

    @Basic
    @Column(name = "comment_num",columnDefinition = BaseExplain.ARTICLE_COMMENT_NUM)
    private Integer commentNum;

    @Basic
    @Column(name = "hits",columnDefinition = BaseExplain.ARTICLE_HITS)
    private Integer hits;

    @Basic
    @Column(name = "type",columnDefinition = BaseExplain.ARTICLE_TYPE)
    private String type;

    @Basic
    @Column(name = "category",columnDefinition = BaseExplain.ARTICLE_CATEGORY)
    private String category;

    @Basic
    @Column(name = "tags",columnDefinition = BaseExplain.ARTICLE_TAGS)
    private String tags;
}
