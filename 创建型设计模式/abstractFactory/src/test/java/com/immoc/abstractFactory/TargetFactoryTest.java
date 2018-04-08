package com.immoc.abstractFactory;

import com.immoc.factory.TargetInterface;
import com.immoc.factory.TargetInterface2;
import junit.framework.TestCase;

public class TargetFactoryTest extends TestCase {

    public void testGetInstance() {
        TargetInterface instance = new TargetFactory().getInstance("二");
        instance.method();
    }

    public void testGetInstance2() {
        TargetInterface2 instance = new TargetFactory2().getInstance2("三");
        instance.method();
    }
}