package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        // 1 . 初始化 被过滤的person列表
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        // 2 .初始化过滤器
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, female);
        Criteria singleOrFemale = new OrCriteria(single, female);

        // 3，过滤操作
        printList(male.meetCriteria(persons));
        printList(female.meetCriteria(persons));
        printList(single.meetCriteria(persons));
        printList(singleMale.meetCriteria(persons));
        printList(singleOrFemale.meetCriteria(persons));

    }

    private static  void printList(List<Person> param) {
        if (null==param ||param.size()<1){
            System.out.println("==============无数据======================");
        }else {
            System.out.println("====================================");
        }
        param.forEach((person) -> {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        });
    }

}
