package com.imooc.springbootjdbctemplate;

public class GoodsDo {
    //商品id
    private long id;
    //商品名称
    private String name;
    //商品价格
    private String price;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //商品图片
    private String pic;
}
