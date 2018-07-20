package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.blog.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Description : 博客管理(文章信息)服务层接口
 * PackageName : cn.itdeer.modules.admin.blog.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午9:55
 */

public interface ArticleService {


    /**
     *
     * @param pageable 分页Bean
     * @return
     * @throws GeneralException
     */
    Page<Article> findAll(Pageable pageable) throws GeneralException;


    /**
     * 按照ID进行查询Article的信息
     * @param id Article的ID
     * @return 一个Article对象
     * @throws GeneralException 统一异常处理
     */
    Article findById(String id) throws GeneralException;

    /**
     * 保存一个Article对象
     * @param article 一个Article对象
     * @return 返回保存的Article对象
     * @throws GeneralException 统一异常处理
     */
    Article save(Article article) throws GeneralException;

    /**
     * 按照ID删除一个Article对象
     * @param id Article的ID
     * @throws GeneralException 统一异常处理
     */
    void delete(String id) throws GeneralException;

    /**
     * 按照分类查询
     * @param pageable
     * @return
     */
    Page<Article> findAllByCategory(Pageable pageable);
}
