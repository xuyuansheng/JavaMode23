package com.immoc;

import com.immoc.strategy.*;
import org.junit.Test;

/**
 * Created by xu on 2017/9/9.
 */
public class AbstractDuckTest {

    @Test
    public void duckTest() {
//        AbstractDuck abstractDuck = new RubberAbstractDuck();
//        AbstractDuck abstractDuck = new RedheadAbstractDuck();
//        AbstractDuck abstractDuck = new MallardAbstractDuck();
        AbstractDuck abstractDuck = new BigYellowAbstractDuck();
        System.out.println("************************************");
        abstractDuck.display();
        abstractDuck.quack();
        abstractDuck.fly();
        System.out.println("************************************");



    }

}
