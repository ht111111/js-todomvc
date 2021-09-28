package com.imooc.springbootjdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //根据id获取商品列表
    @GetMapping("/goods/{id}")
    public GoodsDo getOne(@PathVariable("id") long id){
        return goodsService.getById(id);
    }

    //查询商品
    @GetMapping("/goods")
    public List<GoodsDo> getList(){
        return goodsService.getList();
    }

    //新增商品
    @PostMapping("/goods/{id}")
    public void add(@RequestBody GoodsDo goods){
         goodsService.add(goods);
    }

    //删除商品
    @DeleteMapping("/goods/{id}")
    public void remove(@PathVariable("id") long id){
        goodsService.remove(id);
    }

    //更新商品
    @PutMapping("/goods/{id}")
    public void update(@PathVariable("id") long id, @RequestBody GoodsDo goods){
        //修改指定的id
        goods.setId(id);
        goodsService.edit(goods);
    }

    //移除商品
    @DeleteMapping("/goods/asert/{id}")
    public void delete(@PathVariable("id") long id){
        goodsService.remove(id);
    }
}
