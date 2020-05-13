package flyweight;

/**
 * 管理
 *
 * @author Mr.Xu
 * @date 2020/5/13 21:48
 */
public class Manager implements Employee {
    @Override
    public void  report() {
        System.out.println(reportContent);
    }

    private String department;
    private String  reportContent;


    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
