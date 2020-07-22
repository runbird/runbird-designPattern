package com.scy.chains.demo2;

/**
 * 类名： CollegeApprover <br>
 * 描述：审批额度 <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() < 5000 && request.getPrice() >= 10000) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(request);
        }
    }
}
