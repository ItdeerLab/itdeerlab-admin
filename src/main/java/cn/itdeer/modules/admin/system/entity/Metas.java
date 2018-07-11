package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
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
    @Column(name = "type",columnDefinition="varchar(20) COMMENT '所属'")
    private String type;

    @Basic
    @Column(name = "keywords",columnDefinition="varchar(200) COMMENT '关键词'")
    private String keywords;

    @Basic
    @Column(name = "picture_id",columnDefinition="varchar(50) COMMENT 'ico图片ID'")
    private String pictureId;

    @Basic
    @Column(name = "picture_url",columnDefinition="varchar(100) COMMENT 'ico图片地址'")
    private String pictureUrl;

    @Basic
    @Column(name = "title",columnDefinition="varchar(100) COMMENT '标题'")
    private String title;

    @Basic
    @Column(name = "copy",columnDefinition="varchar(100) COMMENT 'copy号'")
    private String copy;

    @Basic
    @Column(name = "icp",columnDefinition="varchar(100) COMMENT '备案号'")
    private String icp;
}
