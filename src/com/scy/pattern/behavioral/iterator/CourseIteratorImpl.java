package com.scy.pattern.behavioral.iterator;

import java.util.List;

/**
 * 类名： CourseIteratorImpl <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置： " + position);
        course = courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean hasNextCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
