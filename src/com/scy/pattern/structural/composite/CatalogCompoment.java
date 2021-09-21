package com.scy.pattern.structural.composite;

/**
 * 类名： CatalogCompoment <br>
 * 描述： 目录组件：课程+目录<br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class CatalogCompoment {
    public void add(CatalogCompoment catalogCompoment) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogCompoment catalogCompoment) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogCompoment catalogCompoment) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogCompoment catalogCompoment) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
