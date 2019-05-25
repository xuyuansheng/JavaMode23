package com.immoc.visitor.assign;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @program: JavaMode23
 * @description: 单分派和多分派概念
 * @author: Mr.Xu
 * @create: 2019-05-23 21:37
 **/
public class JavaAssign {


	private static East east;
	private static West west;
	public static void main(String[] args) {

		/** 组合1 */
		east = new SubEast1();
		west = new SubWest1();
		east.goEast(west);

		/** 组合2 */
		east = new SubEast1();
		west = new SubWest2();
		east.goEast(west);


		List<String> list = new ArrayList<String>();
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {

			}
		});
	}

}
