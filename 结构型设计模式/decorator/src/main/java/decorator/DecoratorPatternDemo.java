package decorator;

/**
 * @author xuyuansheng
 */
public class DecoratorPatternDemo {


    public static void main(String[] args) {

        Shape shape = new Rectangle();
        AbstractShapeDecorator abstractShapeDecorator = new RedAbstractShapeDecorator(shape);
        shape.draw();
        System.out.println("装饰类中的方法");
        abstractShapeDecorator.draw();
    }
}
