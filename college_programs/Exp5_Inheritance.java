package college_programs;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.*;
class Person {
    String name;
    //String birthdate;
    int year;
    int month;
    int date;
    float height;
    float weight;
    String address;
    Person() {
        name = "NULL";
        String birthdate ="NULL";
        height = 0.0f;
        weight = 0.0f;
        address = "NULL";
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

//    String getBirthdate() {
//        System.out.printf("Birthdate is %d-%d-%d",date,month,year);
//    }

    void setBirthdate(int year,int month,int date) {

        this.date = date;
        this.month = month;
        this.year = year;
    }

    float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    int calculateAge() {
        LocalDate dob = LocalDate.of(year,month,date);
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob,curDate);

        return period.getYears();

//      LocalDate dob = LocalDate.of(year,month,date);
//      obtains the current date from the system clock
//      LocalDate curDate = LocalDate.now();
//      calculates the difference between two dates
//      Period period = Period.between(dob, curDate);
//      prints the difference in years, months, and days
//      System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
    }
}
class Student extends Person {
    int rollno;
    int marks;
    int noofsub;

    Student() {
        rollno = 0;
        marks = 0;
        noofsub = 0;
    }
    int getRollno() {
        return rollno;
    }

    void setRollno(int rollno) {
        this.rollno = rollno;
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getNoofsub() {
        return noofsub;
    }

    void setNoofsub(int noofsub) {
        this.noofsub = noofsub;
    }

    float calculateAvg(int noofsub,int marks) {
        return (float)(marks/noofsub);
    }
}
class Employee2 extends Person {
    int empid;
    float salary;
    float taxrate;

    Employee2() {
        empid = 0;
        salary = 0.0f;
        taxrate = 0.0f;
    }

    int getEmpid() {
        return empid;
    }

    void setEmpid(int empid) {
        this.empid = empid;
    }

    float getSalary() {
        return salary;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    double calculateTax() {
        double tax = 0;
        double exceed_salary = 0;
        float yearly_salary = 12*salary;
        if (yearly_salary <= 250000) {
            tax = 0;
        } else if (yearly_salary >= 250001 && yearly_salary <= 500000) {
            exceed_salary = yearly_salary - 250000;
            tax = 0.05 * exceed_salary;
        } else if (yearly_salary >= 500001 && yearly_salary <= 1000000) {
            exceed_salary = yearly_salary - 500000;
            tax = 12500 + (0.20 * exceed_salary);
        } else { // income > 1000000
            exceed_salary = yearly_salary - 1000000;
            tax = 112500 + (0.30 * exceed_salary);
        }

        return tax;
    }
}
public class Exp5_Inheritance {
    static void setStudent(Student s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student : ");
        String Name = sc.nextLine();
        s.setName(Name);
        System.out.println("Enter Information of birth....");
        System.out.println("Enter Birth date: ");
        int d = sc.nextInt();
        System.out.println("Enter Birth month: ");
        int m = sc.nextInt();
        System.out.println("Enter Birth year: ");
        int y = sc.nextInt();
        s.setBirthdate(y,m,d);
        System.out.println("Enter Height : ");
        float Height = sc.nextFloat();
        s.setHeight(Height);
        System.out.println("Enter Weight : ");
        float Weight = sc.nextFloat();
        s.setWeight(Weight);
        sc.nextLine();
        System.out.println("Enter Address : ");
        String Address = sc.nextLine();
        s.setAddress(Address);
        System.out.println("Enter Roll no : ");
        int rn = sc.nextInt();
        s.setRollno(rn);
        System.out.println("Enter obtained marks : ");
        int Marks = sc.nextInt();
        s.setMarks(Marks);
        System.out.println("Enter no of subject : ");
        int sub_no = sc.nextInt();
        s.setNoofsub(sub_no);
    }
    static void setEmployee(Employee2 emp){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Employee : ");
        String empName = sc.nextLine();
        emp.setName(empName);
        System.out.println("Enter Information of birth....");
        System.out.println("Enter Birth date: ");
        int empdate = sc.nextInt();
        System.out.println("Enter Birth month: ");
        int empmonth = sc.nextInt();
        System.out.println("Enter Birth year: ");
        int empyear = sc.nextInt();
        emp.setBirthdate(empyear,empmonth,empdate);
        System.out.println("Enter Height : ");
        float empHeight = sc.nextFloat();
        emp.setHeight(empHeight);
        System.out.println("Enter Weight : ");
        float empWeight = sc.nextFloat();
        emp.setWeight(empWeight);
        sc.nextLine();
        System.out.println("Enter Address : ");
        String empAddress = sc.nextLine();
        emp.setAddress(empAddress);
        System.out.println("Enter Employee ID : ");
        int empId = sc.nextInt();
        emp.setEmpid(empId);
        System.out.println("Enter Salary : ");
        int empSalary = sc.nextInt();
        emp.setSalary(empSalary);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        Employee2 emp = new Employee2();

        setStudent(s);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Name    = "+s.getName());
        int result = s.calculateAge();
        System.out.println("Age     = "+result);
        System.out.println("Average = "+s.calculateAvg(s.getNoofsub(),s.getMarks()));
        System.out.println("*************************************************************");
        setEmployee(emp);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Name    = "+emp.getName());
        int result1 = emp.calculateAge();
        System.out.println("Age     = "+result1);
        System.out.println("Salary  = "+emp.getSalary());
        System.out.println("Tax     = "+emp.calculateTax());
    }
}