package com.immoc.factory;

/**
 * 需要生产的具体对象4，属于第二个类别TargetInterface2
 * @author xuyuansheng
 */
public class TargetObj4 implements TargetInterface2{
    @Override
	public void method() {
        System.out.println("生成的目标对象 四");
    }
}
