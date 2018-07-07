package cn.itdeer.modules.admin.system.controller;

import cn.itdeer.modules.admin.system.entity.Metas;
import cn.itdeer.modules.admin.system.service.MetasService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

/**
 * Description : 系统管理(页面信息)Web层测试类
 * PackageName : cn.itdeer.modules.admin.system.controller
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/7/23:11
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MetasControllerTest {

    @Autowired
    private MetasService metasService;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}