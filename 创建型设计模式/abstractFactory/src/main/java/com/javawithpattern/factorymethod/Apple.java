package com.javawithpattern.factorymethod;


/**
 * 苹果
 * @author xuyuansheng
 */
public class Apple implements Fruit {


	private int treeAge;

	@Override
	public void grow() {
		System.out.println("苹果正在生长...");
	}

	@Override
	public void harvest() {
		System.out.println("苹果已经收获.");
	}

	@Override
	public void plant() {
		System.out.println("苹果已经种植...");
	}
}
