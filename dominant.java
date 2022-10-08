/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class dominant
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many arrays you want to check : ");
        int T = sc.nextInt();
        for(int i = 0;i < T;i++)
        {
            System.out.println("Enter the size of the array : ");
            int N = sc.nextInt();
            int[] A = new int[N];
            System.out.println("Enter the array elements : ");
            for(int j =0;i < A.length;i++)
            {
                A[i]=sc.nextInt();
            }
            boolean result = findDominant(A);
            if(result == true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    static boolean findDominant(int[] A)
    {
       for(int i = 0;i < A.length;i++)
       {
           for(int j = 0;j < A.length;j++)
           {
               if(A[i] == A[j] && i!=j)
               {
                   return true;
               }
           }
       }
    return false;
    }
}

