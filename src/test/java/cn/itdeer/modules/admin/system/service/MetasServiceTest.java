package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Metas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Description : 系统管理(页面信息)服务层接口测试类
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/7/23:10
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MetasServiceTest {

    @Autowired
    private MetasService metasService;
    private Metas metas;

    @Before
    public void setUp() throws Exception {
        metas = new Metas();
        metas.setId("75dd2e70d8ee41c4b565f3b2efda2dee");
        metas.setType("Index");
        metas.setKeywords("Java BigData");
        metas.setDescription("页面的搜索关键信息");
        metas.setPictureId("123");
        metas.setPictureUrl("http://itdeer.cn/pic/itdeer.ico");
        metas.setTitle("Itdeer的博客");
        metas.setCopy("2017-2020");
        metas.setIcp("京ICP备18002841号-1");
    }

    @Test
    public void findById() throws Exception {
        Metas value_metas = metasService.findById("75dd2e70d8ee41c4b565f3b2efda2dee");
        Assert.assertNotNull(value_metas);
    }

    @Test
    public void save() throws Exception {
        metasService.save(metas);
    }

    @Test
    public void delete() throws Exception {
        metasService.delete("75dd2e70d8ee41c4b565f3b2efda2dee");
    }

}