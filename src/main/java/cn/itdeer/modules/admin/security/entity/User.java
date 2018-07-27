package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import cn.itdeer.common.base.BaseExplain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

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
    @Column(name = "name",columnDefinition = BaseExplain.USER_NAME)
    private String name;


    @Basic
    @JsonIgnore
    @Column(name = "password",columnDefinition = BaseExplain.USER_PASSWORD)
    private String password;

    @Basic
    @Email
    @Column(name = "email",columnDefinition = BaseExplain.USER_EMAIL)
    private String email;

    @Basic
    @Column(name = "gender",columnDefinition = BaseExplain.USER_GENDER)
    private String gender;

    @Basic
    @Column(name = "mobile",columnDefinition = BaseExplain.USER_MOBILE)
    private String mobile;

    @Basic
    @Column(name = "birthday",columnDefinition = BaseExplain.USER_BIRTHDAY)
    private String birthday;

    @Basic
    @Column(name = "nick_name",columnDefinition = BaseExplain.USER_NICK_NAME)
    private String nickName;

    @Basic
    @Column(name = "super_user",columnDefinition = BaseExplain.USER_SUPER_USER)
    private Boolean superUser;

    @Basic
    @Column(name = "if_login",columnDefinition = BaseExplain.USER_IF_LOGIN)
    private Boolean ifLogin;

    @Basic
    @Column(name = "if_online",columnDefinition = BaseExplain.USER_IF_ONLINE)
    private Boolean ifOnline;

    @Basic
    @Column(name = "active_status",columnDefinition = BaseExplain.USER_ACTIVE_STATUS)
    private Boolean activeStatus;

    @Basic
    @Column(name = "last_login",columnDefinition = BaseExplain.USER_LAST_LOGIN)
    private Long lastLogin;

    @Basic
    @Column(name = "last_login_ip",columnDefinition = BaseExplain.USER_LAST_LOGIN_IP)
    private String lastLoginIp;

    @Basic
    @Column(name = "picture_id",columnDefinition = BaseExplain.USER_PICTURE_ID)
    private String pictureId;

    @Basic
    @Column(name = "picture_url",columnDefinition = BaseExplain.USER_PICTURE_URL)
    private String pictureUrl;

    @Basic
    @Column(name = "province",columnDefinition = BaseExplain.USER_PROVINCE)
    private String province;

    @Basic
    @Column(name = "city",columnDefinition = BaseExplain.USER_CITY)
    private String city;

    @Basic
    @Column(name = "home_town",columnDefinition = BaseExplain.USER_HOME_TOWN)
    private String homeTown;

    @Basic
    @Column(name = "dept_id",columnDefinition = BaseExplain.USER_DEPT_ID)
    private String deptId;

    @Basic
    @Column(name = "dept_name",columnDefinition = BaseExplain.USER_DEPT_NAME)
    private String deptName;

    @Basic
    @Column(name = "address",columnDefinition = BaseExplain.USER_ADDRESS)
    private String address;

    @ManyToMany
    @JoinTable(name = "security_user_role",joinColumns = {
            @JoinColumn(name = "security_user_id",referencedColumnName = "ID")},inverseJoinColumns = {
            @JoinColumn(name = "security_role_id",referencedColumnName = "ID")})
    private Set<Role> roles;
}
