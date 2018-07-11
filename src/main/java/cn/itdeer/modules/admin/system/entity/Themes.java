package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import cn.itdeer.common.base.BaseExplain;
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
    @Column(name = "name",columnDefinition = BaseExplain.THEMES_NAME)
    private String name;

    @Basic
    @Column(name = "status",columnDefinition = BaseExplain.THEMES_STATUS)
    private Boolean status;

    @Basic
    @Column(name = "logo_id",columnDefinition = BaseExplain.THEMES_LOGO_ID)
    private String logoId;

    @Basic
    @Column(name = "user_id",columnDefinition = BaseExplain.THEMES_USER_ID)
    private String userId;

    @Basic
    @Column(name = "if_default",columnDefinition = BaseExplain.THEMES_IF_DEFAULT)
    private Boolean ifDefault;

}
