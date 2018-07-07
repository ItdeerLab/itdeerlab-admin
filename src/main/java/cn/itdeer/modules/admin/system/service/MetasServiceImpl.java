package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.exception.info.CodeMessageInfo;
import cn.itdeer.modules.admin.system.entity.Metas;
import cn.itdeer.modules.admin.system.repository.MetasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description : 系统管理(页面信息)服务层实现
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:52
 */

@Service
public class MetasServiceImpl implements MetasService{

    @Autowired
    private MetasRepository metasRepository;

    /**
     * @param id Metas的ID
     * @return 根据Metas ID查询出来的Metas对象
     */
    @Override
    public Metas findById(String id) throws GeneralException{
        return metasRepository.getOne(id);
    }

    /**
     * 保存一个Metas对象
     * @param metas 一个Metas的对象信息
     */
    @Override
    public void save(Metas metas) {
        metasRepository.save(metas);
    }

    /**
     * 按照ID删除一个Metas对象
     * @param id Metas的ID
     * @throws GeneralException
     */
    @Override
    public void delete(String id) throws GeneralException {
        try {
            metasRepository.deleteById(id);
        } catch (Exception e){
            throw new GeneralException(CodeMessageInfo.DELETE_FAIL);
        }
    }

}
