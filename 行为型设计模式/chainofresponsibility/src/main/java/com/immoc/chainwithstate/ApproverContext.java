package com.immoc.chainwithstate;

/**
 * 审批者上下文
 *
 * @author Mr.Xu
 * @date 2020/5/14 14:27
 */
public class ApproverContext {

    private AbstractApprover approver;

    /**
     * 上下文默认会给一个审批者,即责任链的开头位置对象(相当于状态模式中的初始状态)
     *
     * @param approver 审批者,责任链的开头
     */
    public ApproverContext(AbstractApprover approver) {
        this.approver = approver;
        this.approver.setApproverContext(this);
    }

    public ApproverContext setApprover(AbstractApprover approver) {
        this.approver = approver;
        this.approver.setApproverContext(this);
        return this;
    }

    /**
     * 审批操作,即责任链的需要的操作
     *
     * @param course 审批对象,课程
     */
    public void deploy(Course course) {
        if (this.approver == null) {
            System.out.println("已经没有审批者,审批完成.");
        } else {
            this.approver.deploy(course);
        }
    }
}
