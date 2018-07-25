package cn.itdeer.modules.admin.blog.controller;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.modules.admin.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description : 博客管理（类别信息）Web层
 * PackageName : cn.itdeer.modules.admin.blog.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午10:00
 */

@Controller
@RequestMapping(value = "/admin/blog/category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    public String findAll(){

        //categoryService.findAll()

        return null;
    }

    public String save(){

        return null;
    }

    public String delete(){
        return null;
    }

    public String findById(){

        return null;
    }



}
