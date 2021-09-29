package com.imooc.springbootjpa;

import javax.persistence.*;

@Entity
@Table(name = "goods")
public class GoodsDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id ;

    //商品名称
    @Column(name = "name")
    private String name;

    //商品价格
    @Column(name = "price")
    private String price;

    //商品图片
    @Column(name = "pic")
    private String pic;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
