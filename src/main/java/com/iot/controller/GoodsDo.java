package com.iot.controller;

/**
 * 商品数据对象
 */
public class GoodsDo {
    //商品id
    private  long id = 1;
    /**
     * 商品名称
     */
    private String name ="1234";
    /**
     * 商品价格
     */
    private String price ="1234";
    /**
     * 商品图片
     */
    private String pic ="2423";
    // 省略get set方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
