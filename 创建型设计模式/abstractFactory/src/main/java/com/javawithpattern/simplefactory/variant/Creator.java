package com.javawithpattern.simplefactory.variant;

/**
 * @program: JavaMode23
 * @description: 工厂方法
 * @author: Mr.Xu
 * @create: 2019-04-24 22:22
 **/
public class Creator {
	/** 工厂方法 */
	public static ConcreteProduct factory() {
		return new ConcreteProduct();
	}
}
