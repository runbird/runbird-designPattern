package com.scy.builder;

/**
 * 类名： Coach <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/14 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo,
                             String courseArticle, String courseQA) {
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
