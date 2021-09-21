package com.scy.pattern.creational.chains.demo2;

/**
 * 类名： Approver <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class Approver {
    /**
     * 下一个处理者
     */
    protected Approver approver;
    /**
     * 名 字
     */
    protected String name;

    public Approver(String name){
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }


    //处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
