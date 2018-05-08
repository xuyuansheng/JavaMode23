package facade;

/**
 * 外观类，隐藏形状接口的不同实现的使用复杂性，在此处统一暴露出去
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;


    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
