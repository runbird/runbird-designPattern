package com.scy.pattern.structural.proxy;

/**
 * 类名： OrderDaoImpl <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("DAO 数据库添加Order成功");
        return 0;
    }
}
