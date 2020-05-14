package com.immoc.test;

import com.immoc.chain.AbstractApprover;
import com.immoc.chain.ArticleApprover;
import com.immoc.chain.Course;
import com.immoc.chain.VideoApprover;

/**
 * 测试类
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public class Test {

    public static void main(String[] args) {
        AbstractApprover articleApprover = new ArticleApprover();
        AbstractApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java  ");
        course.setArticle("Java 手记");
        course.setVideo("Java精讲视频");

        /*  此处是通过编码的方式指定下一个审批者(即:责任链的下一个处理者),
        另一种方式是, 我们可以通过 状态模式 来在编译阶段就把责任链就指定好 */
        articleApprover.serNextApprover(videoApprover);
        articleApprover.deploy(course);

    }
}
