package com.scy.pattern.creational.builder.v2;

/**
 * 类名： Test2 <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/14 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test2 {

    public static void main(String[] args) {
        Course2 course = new Course2.CourseBuilder()
                .buildCourseName("Java")
                .buildCourseArticle("article")
                .buildCoursePPT("PPT")
                .buildCourseVideo("Video")
                .buildCourseQA("QA").build();
        System.out.println(course);

    //    Guava:
     //   Set<String> set = ImmutableSet.<String>builder().add("a").build();

        //BeanDefinitionBuilder
    }
}
