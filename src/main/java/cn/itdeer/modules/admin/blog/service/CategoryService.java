package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.blog.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.blog.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午10:01
 */

public interface CategoryService {

    Page<Category> findAll(Pageable pageable);

    Category findById(String id);

    Category save(Category category) throws GeneralException;

    void delete(String id) throws GeneralException;
}
