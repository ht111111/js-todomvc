package com.imooc.springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class GoodsController {
     @Autowired
     private GoodsService goodsService;

     //根据id查询商品
    @GetMapping("/goods/{id}")
    public Optional<GoodsDo> getOne(@PathVariable("id") long id){
        return goodsService.getById(id);
    }

    //获取商品列表
    @GetMapping("/goods")
    public Iterable<GoodsDo> getList(){
        return goodsService.getList();
    }

    //新增商品
    @PostMapping("/goods")
    public void add(@RequestBody GoodsDo goods){
        goodsService.add(goods);
    }

    //删除商品
    @DeleteMapping("/goods/{id}")
    public void  delete(@PathVariable("id") long id){
        goodsService.remove(id);
    }

    //编辑商品
    @PostMapping("/goods/edit/{id}")
    public void edit(@PathVariable("id") long id , @RequestBody GoodsDo goods){
        goods.setId(id);
        goodsService.add(goods);
    }
}
