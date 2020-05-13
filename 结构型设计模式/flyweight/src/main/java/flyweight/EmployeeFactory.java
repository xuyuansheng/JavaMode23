package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工接口
 *
 * @author Mr.Xu
 * @date 2020/5/13 21:47
 */
public class EmployeeFactory {

    private final static Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            System.out.print("创建部门经理: " + department);
            manager = new Manager(department);
            EMPLOYEE_MAP.put(department, manager);

            String reportContent = department + "部门的报告: 此次报告内容为...";
            System.out.println("   创建报告: " + reportContent);
            manager.setReportContent(reportContent);
        }
        return manager;
    }

}
