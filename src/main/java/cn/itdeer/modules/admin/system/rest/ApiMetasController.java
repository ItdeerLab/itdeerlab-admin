package cn.itdeer.modules.admin.system.rest;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.system.rest
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/8/18:16
 */

@Api(value = "系统管理Controller", tags = {"用户操作API"})
@RestController
@RequestMapping("/api/admin/system")
@EnableSwagger2
public class ApiMetasController {
}
