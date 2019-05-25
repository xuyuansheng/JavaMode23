package com.immoc.visitor;

/**
 * 表示访问者的接口
 * @author xuyuansheng
 */
public interface ComputerPartVisitor {
     /**
      * visit
      * @param computer
      */
     void visit(Computer computer);
     /**
      * visit
      * @param mouse
      */
     void visit(Mouse mouse);

     /**
      * visit
      * @param keyboard
      */
     void visit(Keyboard keyboard);

     /**
      * visit
      * @param monitor
      */
     void visit(Monitor monitor);

}
