import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private long empNo;
    private String firstName;
    private String lastName;
    private char gender;
    private Date birthDate;
    private Date hireDate;

    public Employee(long empNo) {
        this.empNo = empNo;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(char gender, Date birthDate, Date hireDate) {
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
}
