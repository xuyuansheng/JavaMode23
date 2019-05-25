package com.immoc.factory;

/**
 * 需要生产的具体对象，属于第二个类别TargetInterface2
 * @author xuyuansheng
 */
public class TargetObj3 implements TargetInterface2{
    @Override
	public void method() {
        System.out.println("生成的目标对象 三");
    }
}
