package com.scy.pattern.behavioral.iterator;

/**
 * 类名： CoureIterator <br>
 * 描述： <br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public interface CourseIterator {

    Course nextCourse();

    boolean hasNextCourse();
}
