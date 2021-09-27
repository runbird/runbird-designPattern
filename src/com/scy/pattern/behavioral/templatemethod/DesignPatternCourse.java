package com.scy.pattern.behavioral.templatemethod;

/**
 * 类名： DesignPattenCourse <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
