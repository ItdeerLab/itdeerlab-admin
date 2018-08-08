package cn.itdeer.modules.admin.security.repository;

import cn.itdeer.modules.admin.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 权限管理(用户信息)数据仓库
 * PackageName : cn.itdeer.modules.admin.user.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:05
 */

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,String>{

    User findByName(String name);
}
