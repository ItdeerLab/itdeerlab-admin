package cn.itdeer.modules.admin.system.repository;

import cn.itdeer.modules.admin.system.entity.Themes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 系统管理(主题信息)数据仓库
 * PackageName : cn.itdeer.modules.admin.system.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-14/下午6:42
 */

@Repository
@Transactional
public interface ThemesRepository extends JpaRepository<Themes,String> {

}
