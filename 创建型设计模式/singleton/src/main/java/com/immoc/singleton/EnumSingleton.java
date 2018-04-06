package com.immoc.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void getInstance(){
        System.out.println(INSTANCE.getClass());
    }

    //此处为一个简单的单例,以上才是枚举实现单例的代码
    enum Day{
        MONDAY(1), TUESDAY(2), WEDNESDAY(3),
        THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        private int code;
        Day(int code){
            this.code = code;
        }
        public int getCode(){
            return code;
        }

    }
}
