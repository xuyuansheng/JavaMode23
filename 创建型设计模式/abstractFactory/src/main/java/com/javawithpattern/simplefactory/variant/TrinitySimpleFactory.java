package com.javawithpattern.simplefactory.variant;

/**
 * @program: JavaMode23
 * @description: 工厂模式的变体: 工厂角色,抽象产品角色,具体产品角色都是这一个类.即: 自己时自己的工厂类
 * @author: Mr.Xu
 * @create: 2019-04-24 22:33
 **/
public class TrinitySimpleFactory {

	public static TrinitySimpleFactory factory() {
		return new TrinitySimpleFactory();
	}

}
