package cn.itdeer.modules.admin.security.service;

import cn.itdeer.modules.admin.security.entity.User;
import cn.itdeer.modules.admin.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description : 权限管理(用户信息)服务层实现
 * PackageName : cn.itdeer.modules.admin.user.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:07
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @param id 用户ID
     * @return
     */
    @Override
    public User findById(String id) {
        return userRepository.getOne(id);
    }

    /**
     *
     * @param pageable
     * @return
     */
    @Override
    public Page<User> findAllByPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    /**
     *
     * @param user 需要保存的用户对象
     */
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     *
     * @param id 用户的ID
     */
    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
