package com.immoc.visitor.assign;

/**
 * @program: JavaMode23
 * @description:
 * @author: Mr.Xu
 * @create: 2019-05-23 22:18
 **/
public class SubEast2 implements East {
	@Override
	public void goEast(West west) {
		west.goWest2(this);
	}

	public String myName2(){
		return "SubEast2";
	}
}
