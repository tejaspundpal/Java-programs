import java.io.*;
import java.util.*;

public class HR_Static_initilaizer_block {
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();

    static boolean flag = initializerblock();
    static boolean initializerblock()
    {
        if(B <= 0 || H <= 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive" );
            flag = false;
        }
        else
        {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int area = 0;
        if(flag)
       {
           area = B * H;
           System.out.println(area);

       }
    }
}
