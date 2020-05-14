package com.immoc.chainwithstate;

/**
 * @author Mr.Xu
 * @date 2020/5/14 13:54
 */
public class VideoApprover extends AbstractApprover {

    public VideoApprover() {
        this.nextApprover = null;
    }

    @Override
    public void deploy(Course course) {
        if (course == null || course.getVideo() == null) {
            System.out.println(course.getName() + "不包含视频,审批拒绝,流程结束....");
            return;
        }
        System.out.println(course.getName() + "包含视频,审批通过,继续下一个流程.");
        /*  继续给下一个审批者审批 */
        super.doNextDeploy(course);

    }
}
