package filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 *过滤Person的过滤器，实现过滤单身
 */
public class CriteriaSingle implements Criteria<Person>{
    @Override
    public List<Person> meetCriteria(List<Person> param) {
        return param.stream().filter((v)->v.getMaritalStatus().equalsIgnoreCase("single")).collect(Collectors.toList());
    }
}
