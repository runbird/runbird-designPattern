package com.scy.pattern.structural.facade;

/**
 * 类名： QualifyService <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class QualifyService {
    /**
     * 资格校验
     *
     * @param pointGift
     * @return
     */
    public boolean isAvailable(PointGift pointGift) {
        System.out.println("校验 " + pointGift.getName());
        return true;
    }
}
