package com.immoc.visitor;

/**
 * @author xuyuansheng
 */
public class Mouse implements ComputerPart {
    @Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
