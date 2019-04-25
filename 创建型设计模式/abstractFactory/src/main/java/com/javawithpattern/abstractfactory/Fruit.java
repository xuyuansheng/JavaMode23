package com.javawithpattern.abstractfactory;

/**
 * @program: JavaMode23
 * @description: 水果类的抽象
 * @author: Mr.Xu
 * @create: 2019-04-24 22:49
 **/
public interface Fruit {

	/** 生长 */
	void grow();
	/** 收获 */
	void harvest();
	/**  种植 */
	void plant();

}
