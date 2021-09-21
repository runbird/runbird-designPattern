package com.scy.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名： CourseCatalog <br>
 * 描述： 目录类<br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class CourseCatalog extends CatalogCompoment {

    private List<CatalogCompoment> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogCompoment catalogCompoment) {
        items.add(catalogCompoment);
    }

    @Override
    public void remove(CatalogCompoment catalogCompoment) {
        items.remove(catalogCompoment);
    }

    @Override
    public String getName(CatalogCompoment catalogCompoment) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogCompoment catalogCompoment : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogCompoment.print();
        }
    }
}
