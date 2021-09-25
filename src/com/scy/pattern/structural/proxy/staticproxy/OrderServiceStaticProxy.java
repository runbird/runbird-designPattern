package com.scy.pattern.structural.proxy.staticproxy;

import com.scy.pattern.structural.proxy.IOrderService;
import com.scy.pattern.structural.proxy.Order;
import com.scy.pattern.structural.proxy.OrderServiceImpl;
import com.scy.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 类名： OrderServiceStaticProxy <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderServiceStaticProxy {
    private IOrderService orderService;

    public int saveOrder(Order order) {
        beforeMethod();
        orderService = new OrderServiceImpl();

        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 {db" + dbRouter + "} 处理数据");

        DataSourceContextHolder.setDBType("db" + dbRouter);
        afterMethod();
        return orderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
