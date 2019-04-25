package com.javawithpattern.abstractfactory;

import lombok.Data;

/**
 * @program: JavaMode23
 * @description: 北方蔬菜
 * @author: Mr.Xu
 * @create: 2019-04-25 21:51
 **/
@Data
public class NorthernVeggie implements Veggie {

	private String name;

	public NorthernVeggie(String name) {
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
