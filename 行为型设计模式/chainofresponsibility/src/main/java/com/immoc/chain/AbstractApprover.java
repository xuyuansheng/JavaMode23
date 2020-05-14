package com.immoc.chain;

/**
 * 审批者类
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public abstract class AbstractApprover {

    private AbstractApprover approver;

    /**
     * 设置下一个审批者
     *
     * @param approver
     */
    public void serNextApprover(AbstractApprover approver) {
        this.approver = approver;
    }

    protected void doNextDeploy(Course course) {
        if (approver != null) {
            approver.deploy(course);
        } else {
            System.out.println("已经没有审批者,审批完成.");
        }
    }

    /**
     * 发布课程
     *
     * @param course 课程
     */
    public abstract void deploy(Course course);

}
