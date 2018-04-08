package com.immoc.factory;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {


    public void test() {
        TargetInterface obj = Factory.getTargetObj("二");
        obj.method();
    }

}