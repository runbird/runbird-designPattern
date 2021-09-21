package com.scy.pattern.structural.composite;

/**
 * 类名： Test <br>
 * 描述： <br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    /**
     * 课程网
     * Course Name: Linux课程 Price: 110.0
     * Course Name: H5课程 Price: 130.0
     * Java课程
     * Course Name: Java电商一期 Price: 300.0
     * Course Name: Java电商二期 Price: 350.0
     * Course Name: Java设计模式 Price: 400.0
     */
    public static void main(String[] args) {
        CatalogCompoment linuxCourse = new Course("Linux课程", 110);
        CatalogCompoment h5Course = new Course("H5课程", 130);

        CatalogCompoment javaCourseCatalog = new CourseCatalog("Java课程", 2);

        CatalogCompoment mallCourse1 = new Course("Java电商一期", 300);
        CatalogCompoment mallCourse2 = new Course("Java电商二期", 350);
        CatalogCompoment designPattern = new Course("Java设计模式", 400);

        javaCourseCatalog.add(mallCourse1);
        javaCourseCatalog.add(mallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogCompoment mainCourse = new CourseCatalog("课程网", 1);
        mainCourse.add(linuxCourse);
        mainCourse.add(h5Course);
        mainCourse.add(javaCourseCatalog);

        mainCourse.print();
    }
}
