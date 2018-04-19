package decorator;

public class DecoratorPatternDemo {


    public static void main(String[] args) {

        Shape shape = new Rectangle();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(shape);
        shape.draw();
        System.out.println("装饰类中的方法");
        shapeDecorator.draw();
    }
}
