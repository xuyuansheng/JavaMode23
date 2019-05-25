package filter;

import java.util.List;

/**
 *   过滤器接口，定义过滤方法
 * @author xuyuansheng
 * @param <T> 需要被过滤的类（此实例中为Person）
 */
public interface Criteria<T>{
    /**
     * meetCriteria
     * @param param
     * @return
     */
    List<T>  meetCriteria(List<T> param);

}
