package cn.itdeer.modules.admin.blog.repository;

import cn.itdeer.common.base.BaseRepository;
import cn.itdeer.modules.admin.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 博客管理(文章信息)数据仓库
 * PackageName : cn.itdeer.modules.admin.blog.repository
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午9:55
 */

@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article,String>,BaseRepository<Article> {

}
