package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

/**
 * Description : 权限管理(User用户)实体类
 * PackageName : cn.itdeer.modules.admin.user.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:06
 */

@Data
@Entity
@ToString
@Table(name = "security_user")
public class User extends BaseEntity{

    @Basic
    @Column(name = "name",columnDefinition="varchar(50) COMMENT '用户名'")
    private String name;

    @Basic
    @Column(name = "password",columnDefinition="varchar(50) COMMENT '密码'")
    private String password;

    @Basic
    @Email
    @Column(name = "email",columnDefinition="varchar(50) COMMENT '邮箱'")
    private String email;

    @Basic
    @Column(name = "gender",columnDefinition="varchar(10) COMMENT '性别'")
    private String gender;

    @Basic
    @Column(name = "mobile",columnDefinition="varchar(20) COMMENT '手机号码'")
    private String mobile;

    @Basic
    @Column(name = "birthday",columnDefinition="varchar(20) COMMENT '生日'")
    private String birthday;

    @Basic
    @Column(name = "nick_name",columnDefinition="varchar(50) COMMENT '昵称'")
    private String nickName;

    @Basic
    @Column(name = "super_user",columnDefinition="BIT COMMENT '是否是超级管理员'")
    private Boolean superUser;

    @Basic
    @Column(name = "if_login",columnDefinition="BIT COMMENT '是否允许登录'")
    private Boolean ifLogin;

    @Basic
    @Column(name = "if_online",columnDefinition="BIT COMMENT '是否在线'")
    private Boolean ifOnline;

    @Basic
    @Column(name = "active_status",columnDefinition="BIT COMMENT '激活状态'")
    private Boolean activeStatus;

    @Basic
    @Column(name = "last_login",columnDefinition="INTEGER COMMENT '最后登录时间'")
    private Long lastLogin;

    @Basic
    @Column(name = "last_login_ip",columnDefinition="varchar(20) COMMENT '最后登录IP'")
    private String lastLoginIp;

    @Basic
    @Column(name = "picture_id",columnDefinition="varchar(50) COMMENT '头像图片ID'")
    private String pictureId;

    @Basic
    @Column(name = "picture_url",columnDefinition="varchar(100) COMMENT '头像图片地址'")
    private String pictureUrl;

    @Basic
    @Column(name = "province",columnDefinition="varchar(50) COMMENT '省份'")
    private String province;

    @Basic
    @Column(name = "city",columnDefinition="varchar(50) COMMENT '城市'")
    private String city;

    @Basic
    @Column(name = "home_town",columnDefinition="varchar(200) COMMENT '家乡地址'")
    private String homeTown;

    @Basic
    @Column(name = "dept_id",columnDefinition="varchar(200) COMMENT '部门ID'")
    private String deptId;

    @Basic
    @Column(name = "dept_name",columnDefinition="varchar(50) COMMENT '部门名称'")
    private String deptName;

    @Basic
    @Column(name = "address",columnDefinition="varchar(200) COMMENT '现在住址'")
    private String address;

}
