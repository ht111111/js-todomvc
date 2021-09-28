package com.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndexController {
    /**
     * 商品控制器
     */
        /**
         * 获取商品列表
         */
        @Autowired
        private GoodsService goodsServices; //自动装配

        //根据id查询商品
        @GetMapping("/goods/{id}")
        public  GoodsDo getOne(@PathVariable("id") long id){
            return  goodsServices.getGoodById(id);
        };

        //查询商品列表
        @GetMapping("/goods")
        public List<GoodsDo> getList(){
            return goodsServices.getGoodList();
        }

        //新增商品
        @PostMapping("/goods")
        public void add(@RequestBody GoodsDo goods){
             goodsServices.addGoods(goods);
        }

        //修改商品
        @PutMapping("/goods/{id}")
        public void update(@PathVariable("id") long id, @RequestBody GoodsDo goods){
            goods.setId(id);
            goodsServices.editGoods(goods);
        }

        //删除商品
        @DeleteMapping("/goods/{id}")
        public void delete(@PathVariable("id") long id){
            goodsServices.removeGood(id);
        }
}


