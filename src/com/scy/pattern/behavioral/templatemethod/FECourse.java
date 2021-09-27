package com.scy.pattern.behavioral.templatemethod;

/**
 * 类名： FECourse <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class FECourse extends ACourse {
    //前端课程中比如React需要手册，VUE不需要手册，需要考虑构造方式注入
    private final boolean needArticel;

    @Override
    void packageCourse() {
        if (needArticel) {
            System.out.println("提供前端手册");
        }
        System.out.println("提供前端代码");
    }


    public FECourse(boolean needArticel) {
        this.needArticel = needArticel;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needArticel;
    }
}
