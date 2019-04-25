package com.javawithpattern.abstractfactory;


/**
 * @program: JavaMode23
 * @description:
 * @author: Mr.Xu
 * @create: 2019-04-25 21:54
 **/
public class NorthernGardener implements Gardener {
	@Override
	public Fruit fruitFactory(String name) {
		return new NorthernFruit(name);
	}

	@Override
	public Veggie veggieFactory(String name) {
		return new NorthernVeggie(name);
	}
}
