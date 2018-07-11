package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Basic;
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

    @Basic
    @Column(name = "name",columnDefinition="varchar(50) COMMENT '主题名称'")
    private String name;

    @Basic
    @Column(name = "status",columnDefinition="BIT COMMENT '主题的当前状态'")
    private Boolean status;

    @Basic
    @Column(name = "logo_id",columnDefinition="varchar(50) COMMENT '主题logoID'")
    private String logoId;

    @Basic
    @Column(name = "user_id",columnDefinition="varchar(50) COMMENT '用户ID'")
    private String userId;

    @Basic
    @Column(name = "if_default",columnDefinition="BIT COMMENT '是否为默认主题'")
    private Boolean ifDefault;

}
