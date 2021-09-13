package com.scy.factory.abstractFactory;

/**
 * 类名： CourseFactory <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public interface CourseFactory {
    Video getVideo();

    Article getArticle();
}
