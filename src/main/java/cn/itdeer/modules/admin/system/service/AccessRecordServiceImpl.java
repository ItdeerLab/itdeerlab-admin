package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.AccessRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/7/0:33
 */

@Service
public class AccessRecordServiceImpl implements AccessRecordService{

    @Autowired
    private AccessRecordService accessRecordService;

    /**
     * 保存访问记录信息
     * @param accessRecord 请求记录实体对象
     * @throws GeneralException 系统统一异常
     */
    @Override
    public void save(AccessRecord accessRecord) throws GeneralException {
        accessRecordService.save(accessRecord);
    }
}
