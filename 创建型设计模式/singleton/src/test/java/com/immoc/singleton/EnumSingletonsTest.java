package com.immoc.singleton;

import junit.framework.TestCase;

public class EnumSingletonsTest extends TestCase {

    public void testGetInstance() {
        EnumSingletons.INSTANCE.getInstance();
    }
}