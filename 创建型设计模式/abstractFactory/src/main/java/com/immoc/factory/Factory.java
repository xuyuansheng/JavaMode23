package com.immoc.factory;

/**
 * 创建目标对象的工厂类
 * 缺点：每添加一个具体产品时都要添加一个目标产品类来实现目标接口，等系统越来越大时会造成系统冗余，目标类太多，维护困难
 * @author xuyuansheng
 */
public class Factory {

    /**
     * 获取目标对象方法
     * @return
     */
    public static TargetInterface getTargetObj(String param) {
        String one = "一";
        String two = "二";
        if (one.equals(param)) {
            return new TargetObj1();
        } else if (two.equals(param)) {
            return new TargetObj2();
        }
        return null;
    }

}
