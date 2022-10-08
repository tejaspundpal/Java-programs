
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

    public class try3 {
        public static void main(String[] args) throws IOException {
            // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            // int N = Integer.parseInt(bufferedReader.readLine().trim());

            // bufferedReader.close();
            Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the no : ");
            int n = sc.nextInt();
            int[] result = new int[10];
            sc.close();
            for(int i = 1;i <= 10 ;i++)
            {
                result[i-1] = n*i;

                System.out.printf("%d * %d = %d",n,i,result[i-1]);
                System.out.println();
            }

        }
    }


