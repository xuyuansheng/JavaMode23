package flyweight;

import org.junit.Test;

import java.util.Random;

/**
 * @author Mr.Xu
 * @date 2020/5/13 21:55
 */
public class EmployeeTest {

    private static final String[] DEPARTMENT = {"RD", "QA", "PM", "BD"};

    @Test
    public void testGetManager() {
        for (int i = 0; i < 15; i++) {
            Employee manager = EmployeeFactory.getManager(DEPARTMENT[new Random().nextInt(DEPARTMENT.length)]);
            manager.report();
        }

    }
}