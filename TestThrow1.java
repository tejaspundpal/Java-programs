import java.util.*;
public class TestThrow1
{
    public static void valid(int age){
        if(age < 18){
            throw new ArithmeticException("Person is not eligible to drive");
        }
        else{
            System.out.println("Person can drive");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        try {
            valid(age);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Eligibility age : 18");
        }
        System.out.println("Rest code....");
    }
}
