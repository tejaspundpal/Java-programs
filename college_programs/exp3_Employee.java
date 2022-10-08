package college_programs;
import java.util.*;
class employeetest
{
    String first_name;
    String last_name;
    float salary;
    employeetest()
    {
        first_name ="NULL";
        last_name ="NULL";
        salary = 0f;
    }
    String getFirst_name()
    {
        return first_name;
    }
    String getLast_name()
    {
        return last_name;
    }
    float getSalary()
    {
        return salary;
    }
    void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }
    void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }
    void setSalary(float salary)
    {
        if(salary < 0){
            this.salary=0f;
        }
        else {
            this.salary = salary;
        }
    }
    float yearlySalary(float salary)
    {
        return (float)12 * salary;
    }
    float raisedSalary(float yearly_salary)
    {
        return yearly_salary+((float)10/100)*yearly_salary;
    }

}
public class exp3_Employee
{
    void setData(employeetest em)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String fn = sc.nextLine();
        em.setFirst_name(fn);
        System.out.println("Enter last Name : ");
        String ln = sc.nextLine();
        em.setLast_name(ln);
        System.out.println("Enter monthly salary : ");
        float s = sc.nextFloat();
        em.setSalary(s);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        employeetest e = new employeetest();
        employeetest e1 = new employeetest();
        exp3_Employee E = new exp3_Employee();
        exp3_Employee E1 = new exp3_Employee();
        System.out.println("Enter information of first employee...");
        E.setData(e);
        System.out.println("Enter information of second employee...");
        E1.setData(e1);
        while(true) {
            System.out.println("1)Get yearly salary of 1st Employee\n2)Get yearly salary of 1st Employee after raising\n3)Get yearly salary of 2nd Employee\n4)Get yearly salary of 2nd Employee after raising\n5)Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("yearly salary : "+e.yearlySalary(e.getSalary()));
                }
                case 2->{
                    System.out.println("yearly salary after raised : "+e.raisedSalary(e.yearlySalary(e.getSalary())));
                }
                case 3->{
                    System.out.println("yearly salary : "+e1.yearlySalary(e1.getSalary()));
                }
                case 4->{
                    System.out.println("yearly salary after raised : "+e1.raisedSalary(e1.yearlySalary(e1.getSalary())));
                }
                case 5->{
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid choice...!!");
                }
            }
        }

    }
}