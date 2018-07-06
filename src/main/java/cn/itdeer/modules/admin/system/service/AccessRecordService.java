package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.AccessRecord;

/**
 * Description : 系统管理(访问记录)服务层接口
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/7/0:32
 */
public interface AccessRecordService {

    /**
     * 保存访问记录信息
     * @param accessRecord 请求记录实体对象
     * @throws GeneralException 系统统一异常
     */
    void save(AccessRecord accessRecord) throws GeneralException;
}
