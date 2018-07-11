package cn.itdeer.modules.admin.security.service;

import cn.itdeer.modules.admin.security.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description : 用户Service实现类
 * PackageName : cn.itdeer.modules.admin.user.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:07
 */

@Service
public class UserServiceImpl implements UserService{


    /**
     *
     * @param id 用户ID
     * @return
     */
    @Override
    public User findById(String id) {
        return null;
    }

    /**
     *
     * @param page 查询的页码
     * @param pageSize 每一页查询的条目
     * @return
     */
    @Override
    public Page<User> findAllByPage(int page, int pageSize) {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<User> findAll() {
        return null;
    }

    /**
     *
     * @param user 需要保存的用户对象
     */
    @Override
    public void save(User user) {

    }

    /**
     *
     * @param id 用户的ID
     */
    @Override
    public void delete(String id) {

    }
}
