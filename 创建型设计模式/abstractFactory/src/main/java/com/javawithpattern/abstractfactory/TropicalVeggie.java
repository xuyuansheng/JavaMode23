package com.javawithpattern.abstractfactory;

/**
 * @program: JavaMode23
 * @description:  热带蔬菜
 * @author: Mr.Xu
 * @create: 2019-04-25 21:52
 **/
public class TropicalVeggie implements Veggie {

	private String name;

	public TropicalVeggie(String name) {
		this.name = name;
	}

	@Override
	public void grow() {
		System.out.println(name);
	}

	@Override
	public void harvest() {
		System.out.println(name);
	}

	@Override
	public void plant() {
		System.out.println(name);
	}
}
