package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.Log;
import cn.itdeer.modules.admin.system.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description : 系统管理(日志信息)服务层实现
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:18
 */

@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private LogRepository logRepository;

    /**
     * 保存日志信息
     * @param log 日志信息对象
     * @throws GeneralException 系统统一异常
     */
    @Override
    public void save(Log log) throws GeneralException {
        logRepository.save(log);
    }
}
