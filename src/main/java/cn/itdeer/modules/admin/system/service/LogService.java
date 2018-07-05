package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.Log;

/**
 * Description : 系统管理(日志信息)服务层接口
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:18
 */

public interface LogService {

    /**
     * 保存日志信息
     * @param log 日志信息对象
     * @throws GeneralException 系统统一异常
     */
    void save(Log log) throws GeneralException;

}
