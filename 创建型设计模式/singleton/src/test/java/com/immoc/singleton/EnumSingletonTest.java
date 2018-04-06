package com.immoc.singleton;

import junit.framework.TestCase;

public class EnumSingletonTest extends TestCase {

    public void testGetInstance() {
        System.out.println(EnumSingleton.Day.FRIDAY);
    }
}