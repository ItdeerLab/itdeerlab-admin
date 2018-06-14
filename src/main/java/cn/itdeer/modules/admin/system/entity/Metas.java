package cn.itdeer.modules.admin.system.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

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

    @Column(name = "metas_type")
    private String type;                            //所属

    @Column(name = "metas_keywords")
    private String keywords;                        //关键词

    @Column(name = "metas_description")
    private String description;                     //描述

    @Column(name = "metas_pictureid")
    private String pictureId;                       //ico图片ID

    @Column(name = "metas_pictureurl")
    private String pictureUrl;                      //ico图片地址

    @Column(name = "metas_title")
    private String title;                           //标题

    @Column(name = "metas_copy")
    private String copy;                            //copy号

    @Column(name = "metas_icp")
    private String icp;                             //备案号
}
