import java.util.*;
import java.io.*;



class try4{
    public static void main(String []argh)
    {


        System.out.println("how many no do u want to enter : ");
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                System.out.println("Enter any no : ");
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x>=-128 && x<=127)
                {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-32768 && x<=32767)
                {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-2147483648 && x<=2147483647)
                {
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



