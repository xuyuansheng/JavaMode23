package com.immoc.visitor;

/**
 * @author xuyuansheng
 */
public class Monitor implements ComputerPart {
    @Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
