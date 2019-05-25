package composite;

/**
 * @author xuyuansheng
 */
public class CompositePattern {


    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite compX = new Composite("Composite X");
        compX.add(new Leaf("Leaf XA"));
        compX.add(new Leaf("Leaf XB"));
        root.add(compX);

        Composite compXY = new Composite("Composite XY");
        compXY.add(new Leaf("Leaf XYA"));
        compXY.add(new Leaf("Leaf XYB"));
        compX.add(compXY);
    /** 根节点名称前面放一个 - */
        root.display(1);
    }

}
