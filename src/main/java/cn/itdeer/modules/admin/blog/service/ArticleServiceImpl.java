package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.blog.entity.Article;
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

    /**
     *
     * @param id Article的ID
     * @return
     * @throws GeneralException
     */
    @Override
    public Article findById(String id) throws GeneralException {
        return null;
    }

    /**
     *
     * @param article 一个Article对象
     * @return
     * @throws GeneralException
     */
    @Override
    public Article save(Article article) throws GeneralException {
        return null;
    }

    /**
     *
     * @param id Article的ID
     * @throws GeneralException
     */
    @Override
    public void delete(String id) throws GeneralException {

    }
}
