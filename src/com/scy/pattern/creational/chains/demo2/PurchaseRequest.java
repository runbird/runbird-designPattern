package com.scy.pattern.creational.chains.demo2;

/**
 * 类名： PurchaseRequest <br>
 * 描述：请求类 <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class PurchaseRequest {

    //请求类型
    private int type = 0;
    private float price = 0.0f;
    // 请求金额
    private int id = 0;

    //构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
