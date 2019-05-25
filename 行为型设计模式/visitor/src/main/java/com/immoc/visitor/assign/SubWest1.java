package com.immoc.visitor.assign;

/**
 * @program: JavaMode23
 * @description:
 * @author: Mr.Xu
 * @create: 2019-05-23 22:06
 **/
public class SubWest1 implements West {
	@Override
	public void goWest1(SubEast1 sbuEast1) {
		System.out.println("SubWest1  "+sbuEast1.myName1());
	}

	@Override
	public void goWest2(SubEast2 subEast2) {
		System.out.println("SubWest1  "+ subEast2.myName2());
	}
}
