package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
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
@Table(name = "security_rule")
public class Role extends BaseEntity {

    @Basic
    @Column(name = "role_name",columnDefinition="varchar(50) COMMENT '角色名称'")
    private String roleName;

    @Basic
    @Column(name = "if_able",columnDefinition="BIT COMMENT '是否是可用'")
    private Boolean ifAble;

    @Basic
    @Column(name = "dept_id",columnDefinition="varchar(50) COMMENT '部门ID'")
    private String deptId;

    @Basic
    @Column(name = "dept_name",columnDefinition="varchar(50) COMMENT '部门名称'")
    private String deptName;



    @Transient
    private Set<User> users = new HashSet<User>();      //用户列表

    @Transient
    private Set<Menu> menus = new HashSet<Menu>();     //角色菜单列表
}
