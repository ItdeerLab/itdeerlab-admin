package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.blog.entity.Article;
import cn.itdeer.modules.admin.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Description : 博客管理(文章信息)服务层实现
 * PackageName : cn.itdeer.modules.admin.blog.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午9:56
 */

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;


    /**
     *
     * @param pageable 分页Bean
     * @return
     * @throws GeneralException
     */
    @Override
    public Page<Article> findAll(Pageable pageable) throws GeneralException {
        return articleRepository.findAll(pageable);
    }

    /**
     *
     * @param id Article的ID
     * @return
     * @throws GeneralException
     */
    @Override
    public Article findById(String id) throws GeneralException {
        return articleRepository.getOne(id);
    }

    /**
     *
     * @param article 一个Article对象
     * @return
     * @throws GeneralException
     */
    @Override
    public Article save(Article article) throws GeneralException {
        return articleRepository.save(article);
    }

    /**
     *
     * @param id Article的ID
     * @throws GeneralException
     */
    @Override
    public void delete(String id) throws GeneralException {
        articleRepository.deleteById(id);
    }

    /**
     *
     * @param pageable
     * @return
     */
    @Override
    public Page<Article> findAllByCategory(Pageable pageable) {
        return null;
    }
}
