package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite : 定义枝节点行为，用来存储子部件，在 AbstractComponent 接口中实现与子部件相关的操作。例如 add 和 remove。
 * @author xuyuansheng
 */
public class Composite extends AbstractComponent {

    private List<AbstractComponent> children = new ArrayList<AbstractComponent>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent c) {
        this.children.add(c);
    }

    @Override
    public void remove(AbstractComponent c) {
        this.children.remove(c);
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

        for (AbstractComponent c : children) {
            c.display(depth +1);
        }
    }
}
