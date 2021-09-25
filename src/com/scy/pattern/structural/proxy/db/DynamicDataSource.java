package com.scy.pattern.structural.proxy.db;

/**
 * 类名： DynamicDataSource <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class DynamicDataSource {

    /**
     * 本应继承Spring  AbstractRoutingDataSource 使用分库
     */
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
