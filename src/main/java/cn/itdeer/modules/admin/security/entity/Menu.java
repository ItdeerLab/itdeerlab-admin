package cn.itdeer.modules.admin.security.entity;

import cn.itdeer.common.base.BaseEntity;
import cn.itdeer.common.base.BaseExplain;
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
    @Column(name = "parent_id",columnDefinition = BaseExplain.MENU_PARENT_ID)
    private String parentId;

    @Basic
    @Column(name = "parent_name",columnDefinition = BaseExplain.MENU_PARENT_NAME)
    private String parentName;

    @Basic
    @Column(name = "name",columnDefinition = BaseExplain.MENU_NAME)
    private String name;

    @Basic
    @Column(name = "url",columnDefinition = BaseExplain.MENU_URL)
    private String url;

    @Basic
    @Column(name = "target",columnDefinition = BaseExplain.MENU_TARGET)
    private String target;

    @Basic
    @Column(name = "icon",columnDefinition = BaseExplain.MENU_ICON)
    private String icon;

    @Basic
    @Column(name = "type",columnDefinition = BaseExplain.MENU_TYPE)
    private String type;

    @Basic
    @Column(name = "sort",columnDefinition = BaseExplain.MENU_SORT)
    private Integer sort;

    @Basic
    @Column(name = "open",columnDefinition = BaseExplain.MENU_OPEN)
    private Boolean open;

    @Basic
    @Column(name = "is_show",columnDefinition = BaseExplain.MENU_IS_SHOW)
    private Boolean isShow;

    @Transient
    private Set<Role> menus = new HashSet<Role>();     //角色菜单列表

    @Transient
    private Set<Menu> child = new HashSet<Menu>(); // 所有子菜单编号
}
