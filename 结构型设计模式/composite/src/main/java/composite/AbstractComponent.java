package composite;

/**
 *  组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理 AbstractComponent 的子部件。
 * @author xuyuansheng
 */
public abstract class AbstractComponent {

    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    /**
     * add
     * @param c
     */
    public abstract void add(AbstractComponent c);

    /**
     * remove
     * @param c
     */
    public abstract void remove(AbstractComponent c);
    /**
     * 显示节点的名称
     * @param depth  名称前面的 - 个数
     */
    public abstract void display(int depth);
}
