package com.immoc.bridge;

import com.immoc.bridge.leftonbridge.Circle;
import com.immoc.bridge.rightonbridge.BlueCircle;
import com.immoc.bridge.rightonbridge.RedCircle;

/**
 * @author xuyuansheng
 */
public class BridgePatternDemo {

    public static void main(String[] args) {

        AbstractShape redCircle = new Circle(new RedCircle(),100,100, 10);
        AbstractShape blueCircle = new Circle(new BlueCircle(),100,100, 10);
        redCircle.drawCircle();
        blueCircle.drawCircle();

    }

}
