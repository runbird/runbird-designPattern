package com.scy.pattern.behavioral.templatemethod;

/**
 * 类名： Test <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static void main(String[] args) {
        ACourse designPattern = new DesignPatternCourse();
        designPattern.makeCourse();

        ACourse vueCourse = new FECourse(false);
        vueCourse.makeCourse();

        ACourse reactCourse = new FECourse(true);
        reactCourse.makeCourse();
    }
}
