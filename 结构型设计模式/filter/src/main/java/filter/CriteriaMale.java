package filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 过滤Person的过滤器，实现过滤男人
 * @author xuyuansheng
 */
public class CriteriaMale implements Criteria<Person> {

    @Override
    public List<Person> meetCriteria(List<Person> param) {
        return param.stream().filter((v)-> "male".equalsIgnoreCase(v.getGender())).collect(Collectors.toList());
    }
}
