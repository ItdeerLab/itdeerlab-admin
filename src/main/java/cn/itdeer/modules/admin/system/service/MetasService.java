package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
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
     * 按照ID进行查询Metas的信息
     * @param id Metas的ID
     * @return 根据Metas ID查询出来的Metas对象
     * @throws GeneralException 统一异常处理
     */
    Metas findById(String id) throws GeneralException;

    /**
     * 保存一个Metas对象
     * @param metas 一个Metas的对象信息
     * @throws GeneralException 统一异常处理
     */
    void save(Metas metas) throws GeneralException;

    /**
     * 按照ID删除一个Metas对象
     * @param id Metas的ID
     * @throws GeneralException 统一异常处理
     */
    void delete(String id) throws GeneralException;

}
