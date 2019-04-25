package com.javawithpattern.abstractfactory;


import lombok.Data;

/**
 * 北方水果
 * @author xuyuansheng
 */
@Data
public class NorthernFruit implements Fruit {

	private String name;

	public NorthernFruit(String name) {
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
