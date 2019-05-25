package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 *  多重标准且关系过滤器
 * @author xuyuansheng
 */
public class AndCriteria implements Criteria<Person> {

    private Criteria<Person>[] list;

    public AndCriteria(Criteria<Person>... list) {
        this.list = list;
    }

    @Override
    public List<Person> meetCriteria(List<Person> param) {
        for (Criteria<Person> criteria:list
             ) {
            param = criteria.meetCriteria(param);
        }
        return param;
    }
}
