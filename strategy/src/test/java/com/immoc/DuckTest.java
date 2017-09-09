package com.immoc;

import com.immoc.strategy.*;
import org.junit.Test;

/**
 * Created by xu on 2017/9/9.
 */
public class DuckTest {

    @Test
    public void duckTest() {
//        Duck duck = new RubberDuck();
//        Duck duck = new RedheadDuck();
//        Duck duck = new MallardDuck();
        Duck duck = new BigYellowDuck();
        System.out.println("************************************");
        duck.display();
        duck.quack();
        duck.fly();
        System.out.println("************************************");



    }

}
