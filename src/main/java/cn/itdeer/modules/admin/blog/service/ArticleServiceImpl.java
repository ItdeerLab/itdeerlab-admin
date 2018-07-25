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
     * 分页查询所有文章
     * @param pageable 分页Bean
     * @return 封装的PageBean
     * @throws GeneralException
     */
    @Override
    public Page<Article> findAll(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }

    /**
     * 按照ID进行查询Article的信息
     * @param id Article的ID
     * @return 一个Article对象
     */
    @Override
    public Article findById(String id) {
        return articleRepository.getOne(id);
    }

    /**
     * 保存一个Article对象
     * @param article 一个Article对象
     * @return 返回保存的Article对象
     * @throws GeneralException 统一异常处理
     */
    @Override
    public Article save(Article article) throws GeneralException {
        return articleRepository.save(article);
    }

    /**
     * 按照ID删除一个Article对象
     * @param id Article的ID
     * @throws GeneralException 统一异常处理
     */
    @Override
    public void delete(String id) throws GeneralException {
        articleRepository.deleteById(id);
    }

    /**
     * 按照分类查询
     * @param category 类别
     * @param pageable 分页Bean
     * @return 封装的PageBean
     */
    @Override
    public Page<Article> findAllByCategory(String category,Pageable pageable) {
        return articleRepository.findByCategory(category,pageable);
    }

    /**
     * 按照发布状态查询
     * @param releaseState 状态
     * @param pageable 分页Bean
     * @return 封装的PageBean
     */
    @Override
    public Page<Article> findAllByReleaseState(String releaseState,Pageable pageable) {
        return articleRepository.findByReleaseState(releaseState,pageable);
    }
}
