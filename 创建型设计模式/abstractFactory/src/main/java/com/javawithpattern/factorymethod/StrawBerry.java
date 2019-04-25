package com.javawithpattern.factorymethod;


/**
 * 草莓
 */
public class StrawBerry implements Fruit {
	@Override
	public void grow() {
		System.out.println("草莓正在生长...");
	}

	@Override
	public void harvest() {
		System.out.println("草莓已经收获.");
	}

	@Override
	public void plant() {
		System.out.println("草莓已经种植...");
	}
}
