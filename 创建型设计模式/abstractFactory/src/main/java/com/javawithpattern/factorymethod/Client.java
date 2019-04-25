package com.javawithpattern.factorymethod;

/**
 * @program: JavaMode23
 * @description: 客户端, 使用工厂的角色
 * @author: Mr.Xu
 * @create: 2019-04-25 21:15
 **/
public class Client {

	private static FruitGardener appleGardener, grapeGardener;
	private static Fruit fruit1, fruit2;

	public static void main(String[] args) {
		appleGardener = new AppleGardener();
		fruit1 = appleGardener.factory();

		grapeGardener =new GrapeGardener();
		fruit2 = grapeGardener.factory();

		fruit1.grow();
		fruit2.grow();

	}

}
