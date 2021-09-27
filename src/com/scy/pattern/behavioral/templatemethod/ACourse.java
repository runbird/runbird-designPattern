package com.scy.pattern.behavioral.templatemethod;

/**
 * 类名： ACourse <br>
 * 描述： 模板类<br>
 * 创建日期： 2021/9/27 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArtilce();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作ppt");
    }

    final void makeVideo() {
        System.out.println("制作Video");
    }

    final void writeArtilce() {
        System.out.println("制作手册");
    }

    /**
     * hook方法，让子类重写
     */
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
