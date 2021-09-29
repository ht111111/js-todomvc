package com.imooc.springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoodsService {
    @Autowired
    private IGoodsDao goodsDao;

    //新增商品
    public void add(GoodsDo goods){
        goodsDao.save(goods);
    }

    //删除商品
    public  void  remove(Long id){
        goodsDao.deleteById(id);
    }

    //编辑商品
    public void edit(GoodsDo goods){
        goodsDao.save(goods);
    }

    //按id查询商品
    public Optional<GoodsDo> getById(Long id){
        return goodsDao.findById(id);
    }

    //获取商品列表
    public Iterable<GoodsDo> getList(){
        return  goodsDao.findAll();
    }
}
