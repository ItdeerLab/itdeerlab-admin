package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.exception.info.CodeMessageInfo;
import cn.itdeer.modules.admin.system.entity.Themes;
import cn.itdeer.modules.admin.system.repository.ThemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description : 系统管理(主题信息)服务层实现
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:56
 */

@Service
public class ThemesServiceImpl implements ThemesService{

    @Autowired
    private ThemesRepository themesRepository;

    /**
     * 查询所有Themes
     * @return 一个Themes的列表
     * @throws GeneralException 统一异常处理
     */
    @Override
    public List<Themes> findAll() throws GeneralException {
        return themesRepository.findAll();
    }

    /**
     * 保存一个Themes对象
     * @param themes 一个Themes的对象
     * @return 返回保存的Themes对象
     * @throws GeneralException  统一异常处理
     */
    @Override
    public Themes save(Themes themes) throws GeneralException {
        return themesRepository.save(themes);
    }

    /**
     * 按照ID进行查询Themes的信息
     * @param id Themes的ID
     * @return 根据Themes的ID查询出来的Themes对象
     * @throws GeneralException 统一异常处理
     */
    @Override
    public Themes findById(String id) throws GeneralException {
        return themesRepository.getOne(id);
    }

    /**
     * 根据ID进行查询Themes的信息
     * @param id Themes的ID
     * @throws GeneralException 统一异常处理
     */
    @Override
    public void delete(String id) throws GeneralException {
        try {
            themesRepository.deleteById(id);
        } catch (Exception e){
            throw new GeneralException(CodeMessageInfo.DELETE_FAIL);
        }
    }
}
