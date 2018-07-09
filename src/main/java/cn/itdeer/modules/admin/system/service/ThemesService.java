package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.Themes;

import java.util.List;

/**
 * Description : 系统管理(主题信息)服务层接口
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:55
 */
public interface ThemesService {

    /**
     * 查询所有Themes
     * @return 一个Themes的列表
     * @throws GeneralException 统一异常处理
     */
    List<Themes> findAll() throws GeneralException;

    /**
     * 保存一个Themes对象
     * @param themes 一个Themes的对象
     * @return 返回保存的Themes对象
     * @throws GeneralException  统一异常处理
     */
    Themes save(Themes themes) throws GeneralException;

    /**
     * 按照ID进行查询Themes的信息
     * @param id Themes的ID
     * @return 根据Themes的ID查询出来的Themes对象
     * @throws GeneralException  统一异常处理
     */
    Themes findById(String id) throws GeneralException;

    /**
     * 根据ID进行查询Themes的信息
     * @param id Themes的ID
     * @throws GeneralException 统一异常处理
     */
    void delete(String id) throws GeneralException;

 }
