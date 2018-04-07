package com.immoc.singleton;

/**
 * 懒加载形式的线程安全的单例
 */
public class IdlerSingletonSynchronized {

    private IdlerSingletonSynchronized instance;

    /**
     * 不推荐使用，因为如果第一个线程判断空时第二个线程进来了就不能保证获取的实例是单例的（唯一的）
     */
    public IdlerSingletonSynchronized getInstance() {
        if(instance==null){
            synchronized (IdlerSingletonSynchronized.class){
                instance = new IdlerSingletonSynchronized();
            }
        }
        return instance;
    }

    /**
     * 在加锁之后再进行null值检查就可以保证单例，推荐使用
     */
    public IdlerSingletonSynchronized getInstanceDoubleCheck() {
        if(instance==null){
            synchronized (IdlerSingletonSynchronized.class){
                if(instance==null)
                instance = new IdlerSingletonSynchronized();
            }
        }
        return instance;
    }


}
