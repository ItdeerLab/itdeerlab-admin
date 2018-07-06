package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.ExceptionRecord;

/**
 * Description : 系统管理(异常记录)服务层接口
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:18
 */

public interface ExceptionRecordService {

    /**
     * 保存异常记录
     * @param exceptionRecord 异常记录信息对象
     * @throws GeneralException 系统统一异常
     */
    void save(ExceptionRecord exceptionRecord) throws GeneralException;

}
