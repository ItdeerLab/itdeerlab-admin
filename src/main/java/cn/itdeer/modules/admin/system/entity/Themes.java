package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description : 系统管理(主题信息)实体类
 * PackageName : cn.itdeer.modules.admin.system.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-14/下午6:33
 */

@Data
@Entity
@ToString
@Table(name = "system_themes")
public class Themes extends BaseEntity {

    @Column(name = "themes_name")
    private String name;

    @Column(name = "themes_status")
    private boolean status;
}