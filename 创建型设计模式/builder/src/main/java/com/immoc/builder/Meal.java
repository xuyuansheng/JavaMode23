package com.immoc.builder;

import com.immoc.builder.itfc.Item;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Meal表示一餐饭的内容
 * 里面有多个食品（Item） 放在List中
 *
 * @author xuyuansheng
 */
public class Meal {

    private List<Item>  items = new ArrayList<Item>();

    /**
     * 添加食品
     * @param item
     */
    public void addItem(Item item){
        items.add(item);
    }


    public BigDecimal getCost(){

        return items.stream().reduce(BigDecimal.ZERO, new BiFunction<BigDecimal, Item, BigDecimal>() {
            @Override
            public BigDecimal apply(BigDecimal bigDecimal, Item item) {
                return bigDecimal.add(item.price());
            }
        }, new BinaryOperator<BigDecimal>() {
            @Override
            public BigDecimal apply(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
                return bigDecimal.add(bigDecimal2);
            }
        });
    }

    public void showItems(){
        items.forEach((item)->{
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
            System.out.println("Total Cost: " +this.getCost());
        });
    }
}
