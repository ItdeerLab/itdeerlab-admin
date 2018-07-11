package cn.itdeer.common.base;


/**
 * Description : 数据库表子段信息说明
 * PackageName : cn.itdeer.common.base
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-11/下午5:09
 */

public abstract class BaseExplain {


    /**
     * BaseEntity
     */
    public static final String BASE_ID = "varchar(50) COMMENT 'ID编号'";
    public static final String BASE_CREATE_TIME = "INTEGER COMMENT '创建时间'";
    public static final String BASE_UPDATE_TIME = "INTEGER COMMENT '更新时间'";
    public static final String BASE_REMARKS = "varchar(200) COMMENT '描述'";


    /**
     * Article
     */
    public static final String ARTICLE_TITLE = "varchar(50) COMMENT '文章标题'";
    public static final String ARTICLE_TEXT_CONTENT = "TEXT COMMENT 'TEXT内容'";
    public static final String ARTICLE_HTML_CONTENT = "TEXT COMMENT 'HTML内容'";
    public static final String ARTICLE_RELEASE_DATE = "INTEGER COMMENT '发布时间'";
    public static final String ARTICLE_RELEASE_STATE = "BIT COMMENT '发布状态'";
    public static final String ARTICLE_IF_COMMENT = "BIT COMMENT '是否允许评论'";
    public static final String ARTICLE_USER_ID = "varchar(50) COMMENT '用户ID'";
    public static final String ARTICLE_USER_NAME = "varchar(50) COMMENT '用户名称'";
    public static final String ARTICLE_PICTURE_ID = "varchar(50) COMMENT '封面图片ID'";
    public static final String ARTICLE_PICTURE_URL = "varchar(100) COMMENT '封面图片地址'";
    public static final String ARTICLE_COMMENT_NUM = "INTEGER COMMENT '评论数'";
    public static final String ARTICLE_HITS = "INTEGER COMMENT '点击数'";
    public static final String ARTICLE_TYPE = "varchar(50) COMMENT '文章类型'";
    public static final String ARTICLE_CATEGORY = "varchar(50) COMMENT '文章类别'";
    public static final String ARTICLE_TAGS = "varchar(200) COMMENT '文章标签'";

    /**
     * Tag
     */
    public static final String TAG_NAME = "varchar(20) COMMENT '标签名称'";

    /**
     * Category
     */
    public static final String CATEGORY_NAME = "varchar(20) COMMENT '类别名称'";
    public static final String CATEGORY_USER_ID = "varchar(50) COMMENT '用户ID'";
    public static final String CATEGORY_USER_NAME = "varchar(50) COMMENT '用户名称'";
}
