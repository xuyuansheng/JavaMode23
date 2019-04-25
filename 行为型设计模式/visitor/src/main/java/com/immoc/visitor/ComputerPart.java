package com.immoc.visitor;

/**
 * 定义一个表示元素的接口
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor  computerPartVisitor);
}
