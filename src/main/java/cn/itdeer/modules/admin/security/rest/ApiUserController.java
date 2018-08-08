package cn.itdeer.modules.admin.security.rest;

import cn.itdeer.modules.admin.security.entity.User;
import cn.itdeer.modules.admin.security.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * Description :
 * PackageName : cn.itdeer.modules.admin.user.rest
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-6-20/上午9:49
 */

@Api(value = "用户管理Controller", tags = {"用户操作API"})
@RestController
@RequestMapping("/api/admin/user")
@EnableSwagger2
public class ApiUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfo")
    @ApiOperation(value = "获取用户信息", tags = {"根据用户ID获取用户的详细信息"}, notes = "ID类型为字符串")
    public User getUserById(@ApiParam(name = "id", value = "用户ID", required = true) String id){
        User user = userService.findById(id);
        return user;
    }


    @GetMapping("/getAllUser")
    @ApiOperation(value = "获取所有用户信息", tags = {"获取全部用户列表"}, notes = "用户列表")
    public List<User> getAllUser(){
        return null;
    }


}
