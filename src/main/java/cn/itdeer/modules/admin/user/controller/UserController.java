package cn.itdeer.modules.admin.user.controller;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.exception.info.CodeMessageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

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

        checkParameter("id","");

        return null;
    }

    @GetMapping("/get/{id}")
    public String get(@PathVariable String id){
        System.out.println("AAAA"+id);
        checkParameter("id",id);
        return null;
    }

    public String save(){
        return null;
    }



    public String delete(){
        return null;
    }

}
