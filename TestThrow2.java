
import java.util.*;
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
public class TestThrow2
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int no = sc.nextInt();
        try {
            if (no < 10) {
               throw new MyException("No is less than 10");
            }
            else{
                System.out.println("no is greater than 10");
            }
        }
        catch(MyException e){
            System.out.println(e);
            System.out.println("Caught Exception...");
            System.out.println(e.getMessage());
        }
        System.out.println("Rest code....");
    }
}
