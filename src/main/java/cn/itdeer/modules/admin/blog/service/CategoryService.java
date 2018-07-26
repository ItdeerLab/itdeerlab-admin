package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.blog.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Description : 博客管理(类别信息)服务层接口
 * PackageName : cn.itdeer.modules.admin.blog.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午10:01
 */

public interface CategoryService {

    /**
     * 分页查询所有类别
     * @param pageable 分页Bean
     * @return 封装的PageBean
     */
    Page<Category> findAll(Pageable pageable);


    /**
     * 按照ID进行查询Category的信息
     * @param id Category的ID
     * @return 一个Category对象
     */
    Category findById(String id);

    /**
     * 保存一个Category对象
     * @param category 一个Category对象
     * @return 返回保存的Category对象
     * @throws GeneralException 统一异常处理
     */
    Category save(Category category) throws GeneralException;

    /**
     * 按照ID删除一个Category对象
     * @param id Category的ID
     * @throws GeneralException 统统一异常处理
     */
    void delete(String id) throws GeneralException;
}
