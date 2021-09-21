package com.scy.pattern.creational.prototype.demo2;

/**
 * 类名： Rectangle <br>
 * 描述：TODO <br>
 * 创建日期： 2020/8/6 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
