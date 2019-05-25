package com.immoc.visitor;

/**
 * @author xuyuansheng
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
