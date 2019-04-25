package com.javawithpattern.factorymethod;

/**
 * @program: JavaMode23
 * @description: 具体的工厂角色
 * @author: Mr.Xu
 * @create: 2019-04-24 22:53
 **/
public class GrapeGardener implements FruitGardener {
	/** 工厂方法,用来创建 */
	@Override
	public Fruit factory() {
		return new Grape();
	}
}
