package com.scy.pattern.behavioral.iterator;

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
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Golang电商一期");
        Course course4 = new Course("Golang电商二期");
        Course course5 = new Course("Python电商一期");
        Course course6 = new Course("Python电商二期");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("------课程列表------");
        printCourse(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("------课程更改------");
        printCourse(courseAggregate);
    }

    private static void printCourse(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.hasNextCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println("course: " + course.getName());
        }
    }
}
