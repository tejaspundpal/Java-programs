import java.util.Scanner;

public class equal_no
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
            if(1 <= a && a <= 50 && 1 <= b &&  b <= 50 && a <= b) {
                for (int j = 1; j <= 50; j++) {
                    if ((a * j) == b) {
                        System.out.println("YES");
                    }
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
