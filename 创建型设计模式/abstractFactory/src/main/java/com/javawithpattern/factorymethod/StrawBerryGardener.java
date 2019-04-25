package com.javawithpattern.factorymethod;

/**
 * @program: JavaMode23
 * @description: 具体的工厂角色
 * @author: Mr.Xu
 * @create: 2019-04-24 22:53
 **/
public class StrawBerryGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new StrawBerry();
	}
}
