package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite : 定义枝节点行为，用来存储子部件，在 Component 接口中实现与子部件相关的操作。例如 Add 和 Remove。
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        this.children.add(c);
    }

    @Override
    public void Remove(Component c) {
        this.children.remove(c);
    }
    /**
     * 显示节点的名称
     * @param depth  名称前面的 - 个数
     */
    @Override
    public void Display(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++)
            temp += '-';
        System.out.println(temp + name);

        for (Component c : children) {
            c.Display(depth +1);
        }
    }
}
