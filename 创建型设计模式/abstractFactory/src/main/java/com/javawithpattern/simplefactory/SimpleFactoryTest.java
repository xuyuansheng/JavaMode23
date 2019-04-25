package com.javawithpattern.simplefactory;

import java.text.SimpleDateFormat;

/**
 * @program: JavaMode23
 * @description: 简单工厂的测试类
 * @author: Mr.Xu
 * @create: 2019-04-24 22:16
 **/
public class SimpleFactoryTest {


	public static void main(String[] args) {

		Fruit apple = FruitGardener.factory("apple");
		Fruit strawBerry = FruitGardener.factory("strawBerry");
		Fruit grape = FruitGardener.factory("grape");

		System.out.println(apple);
	}

}
