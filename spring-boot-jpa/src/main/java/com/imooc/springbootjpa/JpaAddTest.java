package com.imooc.springbootjpa;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaAddTest {
    @Autowired
    private  IGoodsDao iGoodsDao;

    @Test
    public void testAdd(){
        GoodsDo goods = new GoodsDo();
        goods.setName("长老");
        goods.setPic("li.jpg");
        goods.setPrice("2.0");
        GoodsDo result = iGoodsDao.save(goods);
        System.out.println("新增商品id:"+ result.getId());
        assertNotNull(result);
    }
}
