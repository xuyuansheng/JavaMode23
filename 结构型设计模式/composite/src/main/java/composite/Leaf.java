package composite;

/**
 * @author xuyuansheng
 */
public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent c) {
        System.out.println("Can not add to a leaf");
    }

    @Override
    public void remove(AbstractComponent c) {
        System.out.println("Can not remove from a leaf");
    }

    /**
     * 显示节点的名称
     * @param depth  名称前面的 - 个数
     */
    @Override
    public void display(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++) {
			temp += '-';
		}
        System.out.println(temp + name);
    }
}
