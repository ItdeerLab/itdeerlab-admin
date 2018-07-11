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

    /**
     * AccessRecord
     */
    public static final String ACCESS_RECORD_ID = "varchar(50) COMMENT 'ID'";
    public static final String ACCESS_RECORD_URL = "varchar(100) COMMENT '请求路径'";
    public static final String ACCESS_RECORD_HTTP_METHOD = "varchar(20) COMMENT '请求方式'";
    public static final String ACCESS_RECORD_IP = "varchar(50) COMMENT '请求IP'";
    public static final String ACCESS_RECORD_CLASS_METHOD = "varchar(100) COMMENT '请求方法名'";
    public static final String ACCESS_RECORD_ARGS = "varchar(100) COMMENT '请求参数'";
    public static final String ACCESS_RECORD_TIME = "INTEGER COMMENT '请求时间'";

    /**
     * ExceptionRecord
     */
    public static final String EXCEPTION_RECORRD_ID = "varchar(50) COMMENT 'ID'";
    public static final String EXCEPTION_RECORRD_TIME = "INTEGER COMMENT '日志记录时间'";
    public static final String EXCEPTION_RECORRD_REQUEST_METHOD = "varchar(20) COMMENT '请求的方法(Get Post Put等)'";
    public static final String EXCEPTION_RECORRD_ACCESS_METHOD = "varchar(50) COMMENT '请求系统的方法(提供请求的方法)'";
    public static final String EXCEPTION_RECORRD_URL = "varchar(100) COMMENT '请求地址'";
    public static final String EXCEPTION_RECORRD_IP = "varchar(50) COMMENT '请求者IP'";
    public static final String EXCEPTION_RECORRD_TYPE = "varchar(50) COMMENT '请求类型（RestAPI,通常API）'";
    public static final String EXCEPTION_RECORRD_STATUS = "varchar(10) COMMENT '日志状态'";

    /**
     * Metas
     */
    public static final String METAS_TYPE = "varchar(20) COMMENT '所属'";
    public static final String METAS_KEYWORDS = "varchar(200) COMMENT '关键词'";
    public static final String METAS_PICTURE_ID = "varchar(50) COMMENT 'ico图片ID'";
    public static final String METAS_PICTURE_URL = "varchar(100) COMMENT 'ico图片地址'";
    public static final String METAS_TITLE = "varchar(100) COMMENT '标题'";
    public static final String METAS_COPY = "varchar(100) COMMENT 'copy号'";
    public static final String METAS_ICP = "varchar(100) COMMENT '备案号'";

    /**
     * Themes
     */
    public static final String THEMES_NAME = "varchar(50) COMMENT '主题名称'";
    public static final String THEMES_STATUS = "varchar(50) COMMENT '主题名称'";
    public static final String THEMES_LOGO_ID = "varchar(50) COMMENT '主题logoID'";
    public static final String THEMES_USER_ID = "varchar(50) COMMENT '用户ID'";
    public static final String THEMES_IF_DEFAULT = "BIT COMMENT '是否为默认主题'";

    /**
     * Menu
     */
    public static final String MENU_PARENT_ID = "varchar(10) COMMENT '父级菜单ID'";
    public static final String MENU_PARENT_NAME = "varchar(20) COMMENT '父级菜单名称'";
    public static final String MENU_NAME = "varchar(50) COMMENT '菜单名称'";
    public static final String MENU_URL = "varchar(100) COMMENT '菜单链接'";
    public static final String MENU_TARGET = "varchar(10) COMMENT '目标'";
    public static final String MENU_ICON = "varchar(50) COMMENT '图标'";
    public static final String MENU_TYPE = "varchar(10) COMMENT '0：目录1：菜单2：按钮'";
    public static final String MENU_SORT = "INTEGER COMMENT '排序'";
    public static final String MENU_OPEN = "BIT COMMENT 'ztree是否打开'";
    public static final String MENU_IS_SHOW = "BIT COMMENT '是否在菜单中显示1：显示；0：不显示'";

    /**
     * Role
     */
    public static final String ROLE_NAME = "varchar(50) COMMENT '角色名称'";
    public static final String ROLE_IF_ABLE = "BIT COMMENT '是否是可用'";
    public static final String ROLE_DEPT_ID = "varchar(50) COMMENT '部门ID'";
    public static final String ROLE_DEPT_NAME = "varchar(50) COMMENT '部门名称'";

    /**
     * User
     */
    public static final String USER_NAME = "varchar(50) COMMENT '用户名'";
    public static final String USER_PASSWORD = "varchar(50) COMMENT '密码'";
    public static final String USER_EMAIL = "varchar(50) COMMENT '邮箱'";
    public static final String USER_GENDER = "varchar(10) COMMENT '性别'";
    public static final String USER_MOBILE = "varchar(20) COMMENT '手机号码'";
    public static final String USER_BIRTHDAY = "varchar(20) COMMENT '生日'";
    public static final String USER_NICK_NAME = "varchar(50) COMMENT '昵称'";
    public static final String USER_SUPER_USER = "BIT COMMENT '是否是超级管理员'";
    public static final String USER_IF_LOGIN = "BIT COMMENT '是否允许登录'";
    public static final String USER_IF_ONLINE = "BIT COMMENT '是否在线'";
    public static final String USER_ACTIVE_STATUS = "BIT COMMENT '激活状态'";
    public static final String USER_LAST_LOGIN = "INTEGER COMMENT '最后登录时间'";
    public static final String USER_LAST_LOGIN_IP = "varchar(20) COMMENT '最后登录IP'";
    public static final String USER_PICTURE_ID = "varchar(50) COMMENT '头像图片ID'";
    public static final String USER_PICTURE_URL = "varchar(100) COMMENT '头像图片地址'";
    public static final String USER_PROVINCE = "varchar(50) COMMENT '省份'";
    public static final String USER_CITY = "varchar(50) COMMENT '城市'";
    public static final String USER_HOME_TOWN = "varchar(200) COMMENT '家乡地址'";
    public static final String USER_DEPT_ID = "varchar(200) COMMENT '部门ID'";
    public static final String USER_DEPT_NAME = "varchar(50) COMMENT '部门名称'";
    public static final String USER_ADDRESS = "varchar(200) COMMENT '现在住址'";




}
