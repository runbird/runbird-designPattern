package com.scy.pattern.structural.composite;

/**
 * 类名： Course <br>
 * 描述： 课程类<br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Course extends CatalogCompoment {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogCompoment catalogCompoment) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogCompoment catalogCompoment) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name: " + name + " Price: " + price);
    }
}
