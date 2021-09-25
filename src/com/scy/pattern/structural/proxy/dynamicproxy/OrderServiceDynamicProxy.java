package com.scy.pattern.structural.proxy.dynamicproxy;

import com.scy.pattern.structural.proxy.Order;
import com.scy.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类名： OrderServiceDynamicProxy <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> clz = target.getClass();
        return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObejct = args[0];
        beforeMethod(argObejct);
        //要被增强的返回值
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
            int dbRouter = userId % 2;
            System.out.println("动态代理分配到 {db" + dbRouter + "} 处理数据");
            DataSourceContextHolder.setDBType("db" + dbRouter);
        }
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");

    }
}
