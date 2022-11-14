package college_programs;
import java.util.Scanner;
public class Exp1_date {

  public static void main(String[] args){
    String[] D = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the date : ");
    int date = sc.nextInt();
    int Month =  sc.nextInt();
    int Year =  sc.nextInt();
    
    int a = (14 - Month)/12;
    int Y= Year - a;
    int M = Month + 12 * a -2;
    int F = (int)((date + Y + (Y/4) - (Y/100) + (Y/400) + ((31 * M)/12)))%7;


  System.out.println(" today day is " + D[F] );

  // int date2 = sc.nextInt();
  // int Month2 =  sc.nextInt();
  //int Year2 =  sc.nextInt();
 }

}