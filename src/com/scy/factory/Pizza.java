package com.scy.factory;

/**
 * 类名： Pizza <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Pizza {
    private String name;
    private String type;
    private long price;

    public void prepare() {
        System.out.println("pizza prepare");
    }

    public void bake() {
        System.out.println("pizza bake");

    }

    public void cut() {
        System.out.println("pizza cut");

    }

    public void box() {
        System.out.println("pizza box");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
