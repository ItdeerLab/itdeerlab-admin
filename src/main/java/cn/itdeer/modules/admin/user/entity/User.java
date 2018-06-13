package cn.itdeer.modules.admin.user.entity;

import cn.itdeer.common.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.user.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:06
 */

@Entity
@Table(name = "itdeer_user")
public class User extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
