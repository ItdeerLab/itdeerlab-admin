package cn.itdeer.modules.admin.system.service;

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
     * 按照ID查询,一个Metas对象
     * @param id
     * @return
     */
    @Override
    public Metas findById(String id) {
        if(id != null && !id.isEmpty()){
            return metasRepository.getOne(id);
        }
        return null;
    }

    /**
     * 保存一个Metas对象
     * @param metas
     */
    @Override
    public void save(Metas metas) {
        metasRepository.save(metas);
    }
}
