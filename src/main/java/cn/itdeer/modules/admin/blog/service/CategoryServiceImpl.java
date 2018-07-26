package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.blog.entity.Category;
import cn.itdeer.modules.admin.blog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Description : 博客管理(类别信息)服务层实现
 * PackageName : cn.itdeer.modules.admin.blog.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午10:01
 */

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;


    /**
     * 分页查询所有类别
     * @param pageable 分页Bean
     * @return 封装的PageBean
     */
    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }


    /**
     * 按照ID进行查询Category的信息
     * @param id Category的ID
     * @return 一个Category对象
     */
    @Override
    public Category findById(String id) {
        return categoryRepository.getOne(id);
    }


    /**
     * 保存一个Category对象
     * @param category 一个Category对象
     * @return 返回保存的Category对象
     * @throws GeneralException 统一异常处理
     */
    @Override
    public Category save(Category category) throws GeneralException {
        return categoryRepository.save(category);
    }


    /**
     * 按照ID删除一个Category对象
     * @param id Category的ID
     * @throws GeneralException 统一异常处理
     */
    @Override
    public void delete(String id) throws GeneralException {
        categoryRepository.deleteById(id);
    }
}
