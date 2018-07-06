package cn.itdeer.modules.admin.system.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.ExceptionRecord;
import cn.itdeer.modules.admin.system.repository.ExceptionRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description : 系统管理(异常记录)服务层实现
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:18
 */

@Service
public class ExceptionRecordServiceImpl implements ExceptionRecordService {

    @Autowired
    private ExceptionRecordRepository exceptionRecordRepository;

    /**
     * 保存异常记录
     * @param exceptionRecord 异常记录信息对象
     * @throws GeneralException 系统统一异常
     */
    @Override
    public void save(ExceptionRecord exceptionRecord) throws GeneralException {
        exceptionRecordRepository.save(exceptionRecord);
    }
}
