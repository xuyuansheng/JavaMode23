package com.immoc.test;

import com.immoc.chainwithstate.ApproverContext;
import com.immoc.chainwithstate.Course;
import com.immoc.chainwithstate.NameApprover;

/**
 * 测试类
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public class TestChainWithState {

    public static void main(String[] args) {
        ApproverContext approverContext = new ApproverContext(new NameApprover());

        Course course = new Course();
        course.setName("Java  ");
        course.setArticle("Java 手记");
        course.setVideo("Java精讲视频");

        approverContext.deploy(course);

    }
}
