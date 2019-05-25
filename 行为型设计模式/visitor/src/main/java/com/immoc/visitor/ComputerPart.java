package com.immoc.visitor;

/**
 * 定义一个表示元素的接口
 * @author xuyuansheng
 */
public interface ComputerPart {
    /**
     * accept
     * @param computerPartVisitor
     */
    void accept(ComputerPartVisitor  computerPartVisitor);
}
