package decorator;

/**
 * 把被装饰对象作为属性的同时又实现了该对象
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape  decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /**
     * 把被装饰对象的原有方法执行一下，即保持原有功能不变
     */
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
