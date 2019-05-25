package com.immoc.builder.itfc;


import java.math.BigDecimal;

/**
 * 一个表示食品的接口
 * 食品有：名称，包装，价格
 * @author xuyuansheng
 */
public interface Item {
     /**
      * name
      * @return
      */
     String name();
     /**
      * price
      * @return
      */
     BigDecimal price();
     /**
      * packing
      * @return
      */
     Packing packing();

}
