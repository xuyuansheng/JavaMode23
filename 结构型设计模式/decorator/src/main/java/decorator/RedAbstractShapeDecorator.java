package decorator;

/**
 * 装饰类的实现类
 * @author xuyuansheng
 */
public class RedAbstractShapeDecorator extends AbstractShapeDecorator {

    public RedAbstractShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }


    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 装饰类增加的额外功能
     * @param decoratedShape
     */
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
