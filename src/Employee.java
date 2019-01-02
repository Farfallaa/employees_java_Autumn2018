import java.util.Date;

public class Employee {

    private static int numberOfEmployees = 0;

    // private fields to store data
    private int empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;

    //Default constructor which takes 0 parameters
    public Employee() {
        this.empNo = Employee.numberOfEmployees++;
    }

    //Additional constructor which takes 5 parameters to set
    //6 attributes:

    public Employee(Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
        this.empNo = Employee.numberOfEmployees++;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    //Getter Methods


    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int getEmpNo() {
        return empNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    //setter methods for 5 attributes:

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    //Converts the 6 attributes into an easy to read
    //string so that they can be printed out later.
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("employeeNumber:").append(this.empNo);
        sb.append("\tfirstName:").append(this.firstName);
        sb.append("\tlastName:").append(this.lastName);
        sb.append("\tdateOfBirth:").append(this.birthDate);
        sb.append("\tgender:").append(this.gender);
        sb.append("\thireDate:").append(this.hireDate);
        return sb.toString();
    }
    //static method to print stars
    public static void printStars(int noStars) {
        int k = 1;
        while (k < noStars) {
            System.out.print("*");
            k++;
        }
    }
}
