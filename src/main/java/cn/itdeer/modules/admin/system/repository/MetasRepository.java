package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Metas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 系统管理(页面信息)数据仓库
 * PackageName : cn.itdeer.modules.admin.system.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-14/下午6:38
 */

@Repository
@Transactional
public interface MetasRepository extends JpaRepository<Metas,String> {

}
