package cn.itdeer.modules.admin.system.controller;

import cn.itdeer.modules.admin.system.entity.Metas;
import cn.itdeer.modules.admin.system.service.MetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description : 系统管理(页面信息)Web层
 * PackageName : cn.itdeer.modules.admin.system.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:52
 */

@Controller
@RequestMapping(name = "/admin/system")
public class MetasController {

    @Autowired
    private MetasService metasService;

    @GetMapping(name = "/metas/{id}")
    public String findById(@PathVariable String id, Model model){
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKkk");
        Metas metas = metasService.findById(id);
        model.addAttribute("metas",metas);
        return "";
    }


    @PostMapping(name = "/metas/save")
    public String save(Metas metas,Model model){

        metasService.save(metas);

        return null;
    }

}
