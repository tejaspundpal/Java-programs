import java.util.Scanner;

public class inputs 
{
    public static void main(String arg[])
    {
        System.out.println("Taking inputs from user...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter no 2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : ");        
        System.out.println(sum);     

    }
}
