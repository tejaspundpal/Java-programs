import java.util.*;
public class loop_que
{
    public static void main(String[] args)
    {
        //Example 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any no : ");
//        int n = sc.nextInt();
//        for(int i = n; i > 0;i--)
//        {
//            for(int j = 0;j < i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Example 2
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the no : ");
//          int n = sc.nextInt();
//          int sum = 0;
//          for(int i = 0;i<=(2*n);i++)
//        {
//            if(i % 2 == 0)
//            {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

        //Example 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        int[] result = new int[10];
        for(int i = 1;i <= 10 ;i++)
        {
          result[i-1] = n*i;
           // System.out.println("hi");
            System.out.println(result[i-1]);
        }

   }
}
