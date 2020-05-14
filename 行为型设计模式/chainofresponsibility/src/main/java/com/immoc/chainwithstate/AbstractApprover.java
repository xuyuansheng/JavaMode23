package com.immoc.chainwithstate;

/**
 * 审批者类
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public abstract class AbstractApprover {

    protected AbstractApprover nextApprover = null;

    protected ApproverContext approverContext;

    public void setApproverContext(ApproverContext approverContext) {
        this.approverContext = approverContext;
    }


    /**
     * 发布课程
     *
     * @param course 课程
     */
    public abstract void deploy(Course course);


    /**
     * 责任链的下一个
     *
     * @param course
     */
    protected void doNextDeploy(Course course) {
        this.approverContext.setApprover(nextApprover).deploy(course);
    }

}
