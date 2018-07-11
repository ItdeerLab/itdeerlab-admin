package cn.itdeer.modules.admin.security.service;

import cn.itdeer.modules.admin.security.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Description : 用户管理服务层接口
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
     * @param page 查询的页码
     * @param pageSize 每一页查询的条目
     * @return 返回查询的一页数据
     */
    Page<User> findAllByPage(int page,int pageSize);

    /**
     * 查询所有用户信息
     * @return 返回所有的查询数据
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user 需要保存的用户对象
     */
    void save(User user);

    /**
     * 按照ID删除用户
     * @param id 用户的ID
     */
    void delete(String id);

}
