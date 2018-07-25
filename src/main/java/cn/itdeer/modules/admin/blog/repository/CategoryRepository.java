package cn.itdeer.modules.admin.blog.repository;

import cn.itdeer.modules.admin.blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.blog.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午10:01
 */

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category,String> {
}
