package cn.itdeer.modules.admin.user.controller;

import cn.itdeer.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description : 用户Controller
 * PackageName : cn.itdeer.modules.admin.user.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/13/23:59
 */

@Controller
@RequestMapping("/admin/user")
public class UserController extends BaseController{


    /**
     * 用户列表
     * @return
     */
    @GetMapping("/list")
    public String list(){

        return null;
    }


    public String get(){
        return null;
    }

    public String save(){
        return null;
    }



    public String delete(){
        return null;
    }

}
