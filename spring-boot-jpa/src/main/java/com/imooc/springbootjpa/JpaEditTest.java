package com.imooc.springbootjpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaEditTest {
    @Autowired
    private IGoodsDao goodsDao;

    //修改测试
    @Test
    public void testEdit(){
        GoodsDo goods = new GoodsDo();
        goods.setId(1l);
        goods.setName("zhangsan");
        goods.setPrice("14.5");
        goods.setPic("zhangsan.jpg");
        GoodsDo result = goodsDao.save(goods);
        System.out.println("修改商品id:"+ result.getId());
        assertNotNull(result);
    }
}
