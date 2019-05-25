package filter;

import java.util.Objects;

/**
 * @author xuyuansheng
 */
public class Person {

    private String name;
    /** 性别 */
    private String gender;
    /** 婚姻状态 */
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(maritalStatus, person.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, maritalStatus);
    }
}
