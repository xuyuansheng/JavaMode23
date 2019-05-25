package com.immoc.factory;

/**
 * 需要生产的具体对象，属于第一个类别TargetInterface
 * @author xuyuansheng
 */
public class TargetObj1 implements TargetInterface{
    @Override
	public void method() {
        System.out.println("生成的目标对象 一");
    }
}
