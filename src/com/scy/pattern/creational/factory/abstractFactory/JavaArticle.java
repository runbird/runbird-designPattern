package com.scy.pattern.creational.factory.abstractFactory;

/**
 * 类名： JavaArticle <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("Java文章");
    }
}
