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
 * CreateTime : 18-7-10/上午9:54
 */

@Data
@Entity
@ToString
@Table(name = "blog_article")
public class Article extends BaseEntity{

    @Column(name = "article_title")
    private String title;                                    //文章标题

    @Column(name = "text_content",columnDefinition="TEXT")
    private String textContent;                             //TEXT内容

    @Column(name = "html_content",columnDefinition="TEXT")
    private String htmlContent;                             //HTML内容

    @Column(name = "article_createdate")
    private Long createDate = new Date().getTime();         //创建时间

    @Column(name = "article_editdate")
    private Long editDate;                                  //修改时间

    @Column(name = "article_releasedate")
    private Date releaseDate;                               //发布时间

    @Column(name = "article_releasestate")
    private Boolean releaseState;                           //发布状态

    @Column(name = "article_ifcomment")
    private Boolean ifComment;                              //是否允许评论

    @Column(name = "article_userid")
    private String userId;                                  //用户ID

    @Column(name = "article_username")
    private String userName;                                //用户名称

    @Column(name = "article_pictureid")
    private String pictureId;                               //封面图片ID

    @Column(name = "article_pictureurl")
    private String pictureUrl;                              //封面图片地址

    @Column(name = "article_commentnum")
    private int commentNum;                                 //评论数

    @Column(name = "article_hits")
    private int hits;                                        //点击数

    @Column(name = "article_type")
    private String type;                                    //文章类型

    @Column(name = "article_category")
    private String category;                                //文章类别

    @Column(name = "article_tags")
    private String tags;                                    //文章标签
}
