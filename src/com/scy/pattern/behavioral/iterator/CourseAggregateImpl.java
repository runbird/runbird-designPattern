package com.scy.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名： CourseAggregateImpl <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
