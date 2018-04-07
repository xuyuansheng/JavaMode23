package com.immoc.singleton;

import java.math.BigDecimal;

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

    enum CostEnum{
        二十三(null,8.8,23L);

        private BigDecimal cost;//花费金额  单位：元
        private Double single;//单条费用 单位：分
        private Long number;//数量

        CostEnum(BigDecimal cost, Double single,Long  number){
            this.cost = cost;
            this.single =single;
            this.number = number;
        }
        public Double getName(){
            return single;
        }
        public Long getNumber() {
            return number;
        }
        public BigDecimal getCost() {
            return new BigDecimal(single*number/100);
        }
    }


}
