import java.util.*;

class Employee{


    String first_name,last_name;
    double monthlysalary,yearlysalary;

    Employee(){
        first_name = "";
        last_name = "";
        monthlysalary = 0.0;
        yearlysalary = 0.0;
    }


    void setFirstName(String first_name){
        this.first_name = first_name;
    }
    void setLastName(String last_name){
        this.last_name = last_name;
    }

    void setMonthlySalary(double salary){
        if(salary<0){
            this.monthlysalary = 0.0;
        }
        else{
            this.monthlysalary = salary;
        }
    }

    void setYearlySalary(double yearlysalary){
        this.yearlysalary = yearlysalary;
    }


    String getFirstName(){
        return first_name;
    }

    String getLastName(){
        return last_name;
    }

    String getFullName(){
        return (first_name + " "+last_name);
    }

    double getMonthlySalary(){
        return monthlysalary;
    }

    double getYearlySalary(){
        return yearlysalary;
    }
}

class Employee_Test{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Employee employee_1 = new Employee();
        Employee employee_2 = new Employee();


        System.out.println("-:Enter First Employee Details:- ");
        System.out.print("Enter First Name:- ");
        String first_name = sc.next();
        System.out.print("Enter Last Name:- ");
        String last_name = sc.next();
        System.out.print("Monthly Salary:- ");
        double salary = sc.nextDouble();

        employee_1.setFirstName(first_name);
        employee_1.setLastName(last_name);
        employee_1.setMonthlySalary(salary);

        System.out.println("-:Enter Second Employee Details:- ");
        System.out.print("Enter First Name:- ");
        String first_name1 = sc.next();
        System.out.print("Enter Last Name:- ");
        String last_name1 = sc.next();
        System.out.print("Monthly Salary:- ");
        double salary1 = sc.nextDouble();

        employee_2.setFirstName(first_name1);
        employee_2.setLastName(last_name1);
        employee_2.setMonthlySalary(salary1);


        System.out.println("-:Details of Employees:-");
        System.out.println("Employee 1: ");
        System.out.println("Full Name:- "+employee_1.getFullName());
        System.out.println("Monthly Salary:- "+employee_1.getMonthlySalary());


        System.out.println("-------------------------------");
        System.out.println("Employee 1: ");
        System.out.println("Full Name:- "+employee_2.getFullName());
        System.out.println("Monthly Salary:- "+employee_2.getMonthlySalary());

        System.out.println("-------------------------------");
        System.out.println("-:Employees Yearly Salary After 10% Increment");



        double e1_ten_p = (employee_1.getMonthlySalary()) * 0.10;
        employee_1.setMonthlySalary(employee_1.getMonthlySalary()+e1_ten_p);
        double yearlysalary1 = (employee_1.getMonthlySalary()*12);
        employee_1.setYearlySalary(yearlysalary1);


        double e2_ten_p = (employee_2.getMonthlySalary()) * 0.10;
        employee_2.setMonthlySalary(employee_2.getMonthlySalary()+e2_ten_p);
        double yearlysalary2 = (employee_2.getMonthlySalary()*12);
        employee_2.setYearlySalary(yearlysalary2);



        System.out.println("Employee 1:- ");
        System.out.println("Full Name:- "+employee_1.getFullName());
        System.out.println("Monthly Salary: "+employee_1.getMonthlySalary());
        System.out.println("Yearly Salary:- "+employee_1.getYearlySalary());

        System.out.println("Employee 2:- ");
        System.out.println("Full Name:- "+employee_2.getFullName());
        System.out.println("Monthly Salary: "+employee_2.getMonthlySalary());
        System.out.println("Yearly Salary:- "+employee_2.getYearlySalary());

    }
}