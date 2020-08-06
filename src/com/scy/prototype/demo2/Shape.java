package com.scy.prototype.demo2;

import java.util.Objects;

/**
 * 类名： Shape <br>
 * 描述：TODO <br>
 * 创建日期： 2020/8/6 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
