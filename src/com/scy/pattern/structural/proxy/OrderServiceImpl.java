package com.scy.pattern.structural.proxy;

/**
 * 类名： OrderServiceImpl <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("Service 调用DAO 添加Order成功");
        return orderDao.insert(order);
    }
}
