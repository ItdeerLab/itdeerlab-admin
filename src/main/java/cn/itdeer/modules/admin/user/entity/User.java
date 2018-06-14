package cn.itdeer.modules.admin.user.entity;

import cn.itdeer.common.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.util.Date;

/**
 * Description : 用户管理实体类
 * PackageName : cn.itdeer.modules.admin.user.entity
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:06
 */

@Data
@Entity
@ToString
@Table(name = "itdeer_user")
public class User extends BaseEntity{

    private String name;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;

    @Column(name = "register_date")
    private Date registerDate;
}
