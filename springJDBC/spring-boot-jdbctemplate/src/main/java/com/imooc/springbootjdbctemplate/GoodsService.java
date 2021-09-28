package com.imooc.springbootjdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    //新增商品
    public void add(GoodsDo goods){
        goodsDao.insert(goods);
    }

    //删除商品
    public void remove(long id){
        goodsDao.delete(id);
    }

    //更新商品
    public void edit(GoodsDo goods){
        goodsDao.update(goods);
    }

    //根据id获取商品
    public GoodsDo getById(long id){
        return goodsDao.getById(id);
    }

    //查询商品列表
    public List<GoodsDo> getList(){
        return goodsDao.getList();
    }
}
