import java.io.*;
import java.util.*;
import java.lang.Math;

public class loop2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n;i++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int ans = n1;
            for(int j = 0;j < n3;j++)
            {
                ans =(int)(ans +  (Math.pow(2,j) * n2) );
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
}
