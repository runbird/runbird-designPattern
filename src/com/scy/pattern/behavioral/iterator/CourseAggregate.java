package com.scy.pattern.behavioral.iterator;

/**
 * 类名： CourseAggregate <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
