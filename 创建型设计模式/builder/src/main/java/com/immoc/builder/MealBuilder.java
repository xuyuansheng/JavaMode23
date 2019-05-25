package com.immoc.builder;

import com.immoc.builder.food.ChickenAbstractBurger;
import com.immoc.builder.food.Coke;
import com.immoc.builder.food.Pepsi;
import com.immoc.builder.food.VegAbstractBurger;

/**
 * 装配一个Meal的内容，虽然看着结构清晰，但是代码仍然看着冗余，繁琐（至少我练习的时候这么觉得）
 * @author xuyuansheng
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegAbstractBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenAbstractBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
