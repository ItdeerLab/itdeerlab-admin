package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Metas;

/**
 * Description : 系统管理(页面信息)服务层接口
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:51
 */
public interface MetasService {

    /**
     * 按照ID查询,一个Metas对象
     * @param id
     * @return
     */
    Metas findById(String id);

    /**
     * 保存一个Metas对象
     * @param metas
     */
    void save(Metas metas);
}
