package com.iot.controller;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {
    public List<GoodsDo> getGoodList(){
        List<GoodsDo> goodlist = new ArrayList<GoodsDo>();
        GoodsDo goods = new GoodsDo();
        goods.setId(1l);
        goods.setName("苹果");
        goods.setPic("apple.jpg");
        goods.setPrice("3.5");
        goodlist.add(goods);
        return goodlist;
    }

    public GoodsDo getGoodById(Long id){
        GoodsDo goods = new GoodsDo();
        goods.setId(1l);
        goods.setName("苹果");
        goods.setPic("apple.jpg");
        goods.setPrice("3.5");
        return goods;
    };

    public int addGoods(GoodsDo goods){
        return 1;
    }

    public int editGoods(GoodsDo goods){
        return 1;
    }

    public int removeGood(long id){
        return 1;
    }
}
