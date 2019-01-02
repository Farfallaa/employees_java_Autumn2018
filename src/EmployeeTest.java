import java.sql.Date;
import java.util.Scanner;


public class EmployeeTest {
    public static void main(String[] args) {
        //no parameters employee object:
        Employee emp1 = new Employee();
        //3 employees with all params:
        Employee emp2 = new Employee(Date.valueOf("1986-02-15"), "Mariusz", "Zitkovski", "male", Date.valueOf("2018-11-14"));
        Employee emp3 = new Employee(Date.valueOf("1987-04-16"), "Henry", "Lynch", "male", Date.valueOf("2018-11-25"));
        Employee emp4 = new Employee(Date.valueOf("1984-03-07"), "Elane", "Murphy", "female", Date.valueOf("2018-11-01"));
        //print out employee details using toString()
        Employee.printStars(150);
        System.out.println();
        System.out.println(emp1.toString());
        System.out.println();
        System.out.println(emp2.toString());
        System.out.println();
        System.out.println(emp3.toString());
        System.out.println();
        System.out.println(emp4.toString());
        Employee.printStars(150);
        //Create 3 more Employee objects using a Scanner, array and for loop
        //create scanner object:
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("How many employees you would like to create?");
        int numberOfEmployees = sc.nextInt();
        //create array of employees
        Employee[] employeeArray = new Employee[numberOfEmployees];
        //use for loop to get user input and populate the objects with values
        for(int a = 0; a < numberOfEmployees; a++){
            Employee currentEmployee = new Employee();
            int b = a+1;
            System.out.println();
            System.out.println("*****Please provide details for Employee No. "+ b +": *****");
            //take and set date of birth:
            System.out.println();
            System.out.println("Birth date (YYYY-MM-DD): ");
            String temp = sc.next();
            Date dob = Date.valueOf(temp);
            currentEmployee.setBirthDate(dob);
            //take and set first name:
            System.out.println("Please enter first name: ");
            String f_name = sc.next();
            currentEmployee.setFirstName(f_name);
            //take and set last name:
            System.out.println("Please provide last name: ");
            String l_name = sc.next();
            currentEmployee.setLastName(l_name);
            //set gender
            System.out.println("Please provide gender: ");
            String gender = sc.next();
            currentEmployee.setGender(gender);
            //set hire date
            System.out.println("Please provide date of hire (YYYY-MM-DD): ");
            String temp1 = sc.next();
            Date hire = Date.valueOf(temp1);
            currentEmployee.setHireDate(hire);
            employeeArray[a] = currentEmployee;
        }
        System.out.println("*************Employee Array************");
        for(int j = 0; j < employeeArray.length; j++){
            System.out.println(employeeArray[j].toString());
            System.out.println();
        }



    }
}
