package cn.itdeer.modules.admin.blog.repository;

import cn.itdeer.modules.admin.blog.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface ArticleRepository extends JpaRepository<Article,String> {

    /**
     * 按照分类查询
     * @param category 类别
     * @param pageable 分页Bean
     * @return 封装的PageBean
     */
    Page<Article> findByCategory(String category,Pageable pageable);

    /**
     * 按照发布状态查询
     * @param releaseState 状态
     * @param pageable 分页Bean
     * @return 封装的PageBean
     */
    Page<Article> findByReleaseState(String releaseState,Pageable pageable);
}
