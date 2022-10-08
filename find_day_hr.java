import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String[] D = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int a = (14 - month)/12;
        int Y= year - a;
        int M= month + 12 * a -2;
        int F=(int)((day + Y + (Y/4) - (Y/100) + (Y/400) + ((31 * M)/12)))%7;

        return D[F].toUpperCase();
    }

}

public class find_day_hr {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String result = Result.findDay(month,day,year);

        System.out.println(result);
    }
}
