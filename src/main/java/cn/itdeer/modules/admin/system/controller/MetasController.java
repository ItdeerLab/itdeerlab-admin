package cn.itdeer.modules.admin.system.controller;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.message.Message;
import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.modules.admin.system.entity.Metas;
import cn.itdeer.modules.admin.system.service.MetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Description : 系统管理(页面信息)Web层
 * PackageName : cn.itdeer.modules.admin.system.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-15/上午9:52
 */

@Controller
@RequestMapping(value = "/admin/system/metas")
public class MetasController extends BaseController {

    @Autowired
    private MetasService metasService;

    /**
     * 按照ID查询Metas的信息
     * @param id Metas的ID
     * @param model 页面信息Model
     * @return 返回页面地址
     * @throws GeneralException 抛出统一异常
     */
    @GetMapping(value = "/findById/{id}")
    public String findById(@PathVariable String id, Model model) throws GeneralException{
        checkParameter("id",id);

        Metas metas = metasService.findById(id);
        model.addAttribute("metas",metas);
        return "/admin/system/metas/show_metas";
    }

    /**
     * 保存一个Metas对象
     * @param metas 信息对象
     * @param ra 重定向属性
     * @return 列表页面
     * @throws GeneralException 抛出统一异常
     */
    @PostMapping(value = "/save")
    public String save(Metas metas,RedirectAttributes ra) throws GeneralException{

        metasService.save(metas);
        addMessage(ra,Message.METAS_SAVE_SUCCESS);

        return "redirect:/admin/system/metas/list";
    }

    /**
     * 按照ID删除Metas
     * @param id Metas的ID
     * @param ra 重定向属性
     * @return 列表页面
     */
    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") String id,RedirectAttributes ra) throws GeneralException{
        checkParameter("id",id);

        metasService.delete(id);
        addMessage(ra,Message.METAS_DELETE_FAIL);

        return "redirect:/admin/system/metas/list";
    }

}
