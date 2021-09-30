package com.scy.pattern.creational.builder;

import com.scy.pattern.creational.builder.v1.Course;

/**
 * 类名： CourseBuilder <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/14 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void  buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
