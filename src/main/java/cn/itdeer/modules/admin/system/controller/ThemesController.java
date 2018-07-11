package cn.itdeer.modules.admin.system.controller;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.message.Message;
import cn.itdeer.modules.admin.system.entity.Themes;
import cn.itdeer.modules.admin.system.service.ThemesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Description : 系统管理(主题信息)Web层
 * PackageName : cn.itdeer.modules.admin.system.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:53
 */

@Controller
@RequestMapping(value = "/admin/system/themes")
public class ThemesController extends BaseController{

    @Autowired
    private ThemesService themesService;

    @GetMapping(value = "/findAll")
    public String findAll(Model model) throws GeneralException{

        List<Themes> themes_list = themesService.findAll();
        model.addAttribute("themes_list",themes_list);

        return "/admin/system/themes/list";
    }

    @GetMapping(value = "/findById/{id}")
    public String findById(@PathVariable String id, Model model) throws GeneralException{
        checkParameter("id",id);

        Themes themes = themesService.findById(id);
        model.addAttribute("themes",themes);

        return "/admin/system/themes/show_metas";
    }

    @PostMapping(value = "/save")
    public String save(Themes themes,RedirectAttributes ra) throws GeneralException{

        themesService.save(themes);
        addMessage(ra,Message.THEMES_SAVE_SUCCESS);

        return "redirect:/admin/system/metas/list";
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") String id, RedirectAttributes ra) throws GeneralException{
        checkParameter("id",id);

        themesService.delete(id);
        addMessage(ra, Message.THEMES_DELETE_FAIL);

        return "redirect:/admin/system/themes/list";
    }

    @GetMapping(value = "/form")
    public String form() throws GeneralException{
        return "/admin/system/themes/show_themes";
    }
}
