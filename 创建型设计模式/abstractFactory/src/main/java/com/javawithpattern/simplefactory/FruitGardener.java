package com.javawithpattern.simplefactory;

/**
 * @program: JavaMode23
 * @description: 农场园丁
 * @author: Mr.Xu
 * @create: 2019-04-24 22:04
 **/
public class FruitGardener {

	/**
	 * 静态工厂方法
	 */
	public static Fruit factory(String which) {
		String apple = "apple";
		String grape = "grape";
		String strawBerry = "strawBerry";
		if (apple.equalsIgnoreCase(which)) {
			return new Apple();
		} else if (grape.equalsIgnoreCase(which)) {
			return new Grape();
		} else if (strawBerry.equalsIgnoreCase(which)) {
			return new StrawBerry();
		} else {
			throw new RuntimeException("Bad Fruit Request");
		}

	}


}
