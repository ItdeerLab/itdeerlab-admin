package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Description : 权限管理(Menu菜单)实体类
 * PackageName : cn.itdeer.modules.admin.security.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-11/下午2:52
 */

@Data
@Entity
@ToString
@Table(name = "security_menu")
public class Menu extends BaseEntity {

    @Basic
    @Column(name = "parent_id",columnDefinition="varchar(10) COMMENT '父级菜单ID'")
    private String parentId;

    @Basic
    @Column(name = "parent_name",columnDefinition="varchar(20) COMMENT '父级菜单名称'")
    private String parentName;

    @Basic
    @Column(name = "menu_name",columnDefinition="varchar(50) COMMENT '菜单名称'")
    private String menuName;

    @Basic
    @Column(name = "menu_url",columnDefinition="varchar(100) COMMENT '菜单链接'")
    private String menuUrl;

    @Basic
    @Column(name = "target",columnDefinition="varchar(10) COMMENT '目标'")
    private String target;

    @Basic
    @Column(name = "icon",columnDefinition="varchar(50) COMMENT '图标'")
    private String icon;

    @Basic
    @Column(name = "type",columnDefinition="varchar(10) COMMENT '0：目录1：菜单2：按钮'")
    private String type;

    @Basic
    @Column(name = "sort",columnDefinition="INTEGER COMMENT '排序'")
    private Integer sort;

    @Basic
    @Column(name = "open",columnDefinition="BIT COMMENT 'ztree是否打开'")
    private Boolean open;

    @Basic
    @Column(name = "is_show",columnDefinition="BIT COMMENT '是否在菜单中显示1：显示；0：不显示'")
    private Boolean isShow;

    @Transient
    private Set<Role> menus = new HashSet<Role>();     //角色菜单列表

    @Transient
    private Set<Menu> child = new HashSet<Menu>(); // 所有子菜单编号
}
