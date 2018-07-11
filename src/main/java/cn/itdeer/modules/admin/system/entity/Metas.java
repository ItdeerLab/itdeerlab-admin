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
 * Description : 系统管理(页面信息)实体类
 * PackageName : cn.itdeer.modules.admin.system.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-14/下午6:27
 */

@Data
@Entity
@ToString
@Table(name = "system_metas")
public class Metas extends BaseEntity {

    @Basic
    @Column(name = "type",columnDefinition = BaseExplain.METAS_TYPE)
    private String type;

    @Basic
    @Column(name = "keywords",columnDefinition = BaseExplain.METAS_KEYWORDS)
    private String keywords;

    @Basic
    @Column(name = "picture_id",columnDefinition = BaseExplain.METAS_PICTURE_ID)
    private String pictureId;

    @Basic
    @Column(name = "picture_url",columnDefinition = BaseExplain.METAS_PICTURE_URL)
    private String pictureUrl;

    @Basic
    @Column(name = "title",columnDefinition = BaseExplain.METAS_TITLE)
    private String title;

    @Basic
    @Column(name = "copy",columnDefinition = BaseExplain.METAS_COPY)
    private String copy;

    @Basic
    @Column(name = "icp",columnDefinition = BaseExplain.METAS_ICP)
    private String icp;
}
