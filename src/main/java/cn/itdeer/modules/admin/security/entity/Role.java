package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import cn.itdeer.common.base.BaseExplain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Description : 权限管理(Rule角色)实体类
 * PackageName : cn.itdeer.modules.admin.security.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-11/下午2:52
 */

@Data
@Entity
@ToString
@Table(name = "security_role")
public class Role extends BaseEntity {

    @Basic
    @Column(name = "name",columnDefinition = BaseExplain.ROLE_NAME)
    private String name;

    @Basic
    @Column(name = "if_able",columnDefinition = BaseExplain.ROLE_IF_ABLE)
    private Boolean ifAble;

    @Basic
    @Column(name = "dept_id",columnDefinition = BaseExplain.ROLE_DEPT_ID)
    private String deptId;

    @Basic
    @Column(name = "dept_name",columnDefinition = BaseExplain.ROLE_DEPT_NAME)
    private String deptName;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    @ManyToMany
    @JoinTable(name = "security_role_menu",joinColumns = {
            @JoinColumn(name = "security_role_id",referencedColumnName = "ID")},inverseJoinColumns = {
            @JoinColumn(name = "security_menu_id",referencedColumnName = "ID")})
    private Set<Menu> menus;
}
