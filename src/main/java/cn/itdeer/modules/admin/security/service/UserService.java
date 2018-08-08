package cn.itdeer.modules.admin.security.service;

import cn.itdeer.modules.admin.security.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Description : 权限管理(用户信息)服务层接口
 * PackageName : cn.itdeer.modules.admin.user.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:07
 */

public interface UserService {

    /**
     * 根据ID查询用户
     * @param id 用户ID
     * @return 根据ID 查询到的User对象
     */
    User findById(String id);

    /**
     * 按照分页查询所有用户信息
     * @param pageable
     * @return 返回查询的一页数据
     */
    Page<User> findAllByPage(Pageable pageable);

    /**
     * 保存用户
     * @param user 需要保存的用户对象
     */
    User save(User user);

    /**
     * 按照ID删除用户
     * @param id 用户的ID
     */
    void delete(String id);

}
