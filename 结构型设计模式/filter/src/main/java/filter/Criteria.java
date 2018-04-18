package filter;

import java.util.List;

/**
 *   过滤器接口，定义过滤方法
 * @param <T> 需要被过滤的类（此实例中为Person）
 */
public interface Criteria<T>{

    List<T>  meetCriteria(List<T> param);

}
