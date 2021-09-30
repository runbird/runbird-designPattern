package com.scy.pattern.creational.builder.v1;

import com.scy.pattern.creational.builder.CourseBuilder;

/**
 * 类名： Test <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/14 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseBuilder courseBuilder = new CourseArticleBuilder();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java", "ppt", "video", "article", "QA");
        System.out.println(course);
    }
}
