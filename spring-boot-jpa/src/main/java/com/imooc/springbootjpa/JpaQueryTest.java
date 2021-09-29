package com.imooc.springbootjpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaQueryTest {
    @Autowired
    private IGoodsDao goodsDao;

    //按id查询
//    @Test
//    public void testQueryById(){
//        Optional<GoodsDo> goodsOptional = goodsDao.findById(1l);
//        GoodsDo goods = goodsOptional.get();
//        System.out.println(goods.getId() + "-" +goods.getName()+"-"+goods.getPic()+"-"+goods.getPrice());
//    }

    //查询全部
    @Test
    public void testQueryAll(){
        Iterable<GoodsDo> goodsIt = goodsDao.findAll();
        for(GoodsDo goods:goodsIt){
            System.out.println(goods.getId()+"-"+goods.getName()+"-"+goods.getPrice()+"-"+goods.getPic());
        }
    }
}
