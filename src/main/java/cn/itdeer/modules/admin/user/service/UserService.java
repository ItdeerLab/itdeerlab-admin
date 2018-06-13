package cn.itdeer.modules.admin.user.service;

import cn.itdeer.modules.admin.user.entity.User;

/**
 * Description : 用户Service
 * PackageName : cn.itdeer.modules.admin.user.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/14/0:07
 */
public interface UserService {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User findById(String id);



}
