package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 系统管理(日志信息)数据仓库
 * PackageName : cn.itdeer.modules.admin.system.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/5/0:16
 */

@Repository
@Transactional
public interface LogRepository  extends JpaRepository<Log,String> {

}
