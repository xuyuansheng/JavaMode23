package filter;

import java.util.*;

/**
 * 多重标准或关系过滤器
 * @author xuyuansheng
 */
public class OrCriteria implements Criteria<Person> {

    private Criteria<Person>[] list;

    public OrCriteria(Criteria<Person>... list) {
        this.list = list;
    }

    @Override
    public List<Person> meetCriteria(List<Person> param) {
        Set<Person> temp = new HashSet<>();
        Arrays.stream(list).forEach((v) -> {
            temp.addAll(v.meetCriteria(param));
        });
        return new ArrayList<>(temp);
    }
}
