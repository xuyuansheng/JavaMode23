package com.immoc.bridge;

import com.immoc.bridge.leftOnBridge.Circle;
import com.immoc.bridge.rightOnBridge.BlueCircle;
import com.immoc.bridge.rightOnBridge.RedCircle;

public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(new RedCircle(),100,100, 10);
        Shape blueCircle = new Circle(new BlueCircle(),100,100, 10);
        redCircle.drawCircle();
        blueCircle.drawCircle();

    }

}
