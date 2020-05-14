package com.immoc.chain;

/**
 * @author Mr.Xu
 * @date 2020/5/14 13:52
 */
public class ArticleApprover extends AbstractApprover {
    @Override
    public void deploy(Course course) {

        if (course == null || course.getArticle() == null) {
            System.out.println(course.getName() + "不包含手记,审批拒绝,流程结束....");
            return;
        }
        System.out.println(course.getName() + "包含手记,审批通过,继续下一个流程.");
        /*  继续给下一个审批者审批 */
        super.doNextDeploy(course);

    }
}
