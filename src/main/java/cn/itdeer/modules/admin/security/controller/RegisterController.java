package cn.itdeer.modules.admin.security.controller;

import cn.itdeer.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description : 用户注册Controller
 * PackageName : cn.itdeer.modules.admin.user.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/13/23:42
 */

@Controller
@RequestMapping("/admin/user")
public class RegisterController extends BaseController{


    @GetMapping("/register")
    public String register(){
        return null;
    }

    @PostMapping("/register")
    public String register(Model model){
        return null;
    }

}
