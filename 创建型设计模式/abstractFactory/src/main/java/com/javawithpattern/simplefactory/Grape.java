package com.javawithpattern.simplefactory;

/**
 * 葡萄
 */
public class Grape implements Fruit {
	@Override
	public void grow() {
		System.out.println("葡萄正在生长...");
	}

	@Override
	public void harvest() {
		System.out.println("葡萄已经收获.");
	}

	@Override
	public void plant() {
		System.out.println("葡萄已经种植...");
	}
}
