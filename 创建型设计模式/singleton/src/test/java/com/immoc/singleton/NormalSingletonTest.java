package com.immoc.singleton;

import junit.framework.TestCase;

public class NormalSingletonTest extends TestCase {

    public void testGetInstance() {
        NormalSingleton instance = NormalSingleton.getInstance();
        NormalSingleton instance2 = NormalSingleton.getInstance();
        System.out.println(instance==instance2);
    }
}