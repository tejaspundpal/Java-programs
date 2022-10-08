import java.util.Scanner;

public class equal_no1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test cases : ");
        int t = sc.nextInt();
        for(int i = 0;i < t;i++)
        {
            System.out.println("enter a: ");
            int a = sc.nextInt();
            System.out.println("enter b: ");
            int b = sc.nextInt();
           if(a == b)
           {
               System.out.println("YES");
           }
           else if(a > b)
           {
               while (true)
               {
                   if(a == b*2) {
                       System.out.println("YES");
                       break;
                   }
                   else if(a < b*2){
                       System.out.println("NO");
                       break;
                   }
                   b = b*2;
               }
           }
           else if(a < b)
           {
               while (true)
               {
                   if(a*2 == b) {
                       System.out.println("YES");
                       break;
                   }
                   else if(a*2 > b){
                       System.out.println("NO");
                       break;
                   }
                   a = a*2;
               }
           }
        }
    }
}
