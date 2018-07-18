package cn.itdeer.modules.admin.blog.controller;

import cn.itdeer.common.base.BaseController;
import cn.itdeer.common.exception.general.GeneralException;
import cn.itdeer.common.message.Message;
import cn.itdeer.modules.admin.blog.entity.Article;
import cn.itdeer.modules.admin.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Description : 博客管理（文章信息）Web层
 * PackageName : cn.itdeer.modules.admin.blog
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-10/上午9:52
 */

@Controller
@RequestMapping(value = "/admin/blog/article")
public class ArticleController  extends BaseController{

    @Autowired
    private ArticleService articleService;

    /**
     * 按照ID查询文章的信息
     * @param id Article的ID
     * @param model 页面信息Model
     * @return 详情页面
     * @throws GeneralException 抛出统一异常
     */
    @GetMapping(value = "/findById/{id}")
    public String findById(@PathVariable(name = "id") String id, Model model) throws GeneralException{
        checkParameter("id",id);

        Article article = articleService.findById(id);
        model.addAttribute("article",article);
        return "/admin/blog/article/show_article";
    }

    /**
     * 保存一个Article对象
     * @param article 文章对象
     * @param ra 重定向属性
     * @return 列表页面
     * @throws GeneralException 抛出统一异常
     */
    @PostMapping(value = "/save")
    public String save(Article article, RedirectAttributes ra) throws GeneralException{

        articleService.save(article);
        addMessage(ra, Message.ARTICLE_SAVE_SUCCESS);

        return "redirect:/admin/blog/article/list";
    }

    /**
     * 按照ID删除Article
     * @param id Article的ID
     * @param ra 重定向属性
     * @return 列表页面
     * @throws GeneralException 抛出统一异常
     */
    public String delete(@PathVariable("id") String id,RedirectAttributes ra) throws GeneralException{
        checkParameter("id",id);

        articleService.delete(id);
        addMessage(ra,Message.ARTICLE_DELETE_SUCCESS);

        return "redirect:/admin/blog/article/list";
    }
}
