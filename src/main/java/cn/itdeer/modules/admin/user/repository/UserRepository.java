package cn.itdeer.modules.admin.user.repository;

import cn.itdeer.modules.admin.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description : 用户数据仓库
 * PackageName : cn.itdeer.modules.admin.user.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:05
 */

public interface UserRepository extends JpaRepository<User,String>{

}
