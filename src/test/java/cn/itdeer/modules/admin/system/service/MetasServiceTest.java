package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Metas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.runners.MethodSorters.NAME_ASCENDING;

/**
 * Description : 系统管理(页面信息)服务层接口测试类
 * PackageName : cn.itdeer.modules.admin.system.service
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/7/23:10
 */

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(NAME_ASCENDING)
public class MetasServiceTest {

    @Autowired
    private MetasService metasService;
    private Metas metas;

    @Test
    public void CRUDTest() throws Exception {
        metas = new Metas();

        metas.setType("Index");
        metas.setKeywords("Java BigData");
        metas.setRemarks("页面的搜索关键信息");
        metas.setPictureId("123");
        metas.setPictureUrl("http://itdeer.cn/pic/itdeer.ico");
        metas.setTitle("Itdeer的博客");
        metas.setCopy("2017-2020");
        metas.setIcp("京ICP备18002841号-1");

        a_save();
        b_findById();
        b_findAll();
        c_delete();
    }

    private void a_save() throws Exception {
        metas = metasService.save(metas);
    }

    private void b_findById() throws Exception {
        Metas value_metas = metasService.findById(metas.getId());
        Assert.assertNotNull(value_metas);
    }

    private void b_findAll(){
        List<Metas> list = metasService.findAll();
        Assert.assertNotNull(list);
    }

    private void c_delete() throws Exception {
        metasService.delete(metas.getId());
    }

}