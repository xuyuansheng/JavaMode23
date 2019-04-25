package com.javawithpattern.abstractfactory;


/**
 * @program: JavaMode23
 * @description: 工厂方法中的抽象工厂
 * @author: Mr.Xu
 * @create: 2019-04-24 22:49
 **/
public interface Gardener {
	/**
	 * 水果的工厂抽象方法
	 *
	 * @param name
	 * @return
	 */
	Fruit fruitFactory(String name);

	/**
	 * 蔬菜的工厂抽象方法
	 *
	 * @param name
	 * @return
	 */
	Veggie veggieFactory(String name);

}
