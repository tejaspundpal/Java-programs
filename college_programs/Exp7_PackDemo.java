package college_programs;
import java.util.*;
import java.lang.*;
import MyMath.*;

class Exp7_PackDemo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trig obj = new Trig();
        Stat obj1 = new Stat();
        Arithmetic obj2 = new Arithmetic();

        boolean flag = true;
        System.out.println("1)Trigonometric operation\n2)Stat Operation\n3)Arithmetic operation\n4)Exit");
        while(flag)
        {
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {

                    System.out.println("Enter the angle : ");
                    float n = sc.nextFloat();
                    obj.setAngle(n);
                    System.out.println("sin("+n+") = "+obj.sine());
                    System.out.println("cos("+n+") = "+obj.cosine());
                    System.out.println("tan("+n+") = "+obj.tangent());
                    System.out.println("cot("+n+") = "+obj.cotangent());
                    System.out.println("sec("+n+") = "+obj.secant());
                    System.out.println("cosec("+n+") = "+obj.cosecant());
                }
                case 2 -> {

                    System.out.println("Enter the no of elements : ");
                    int no = sc.nextInt();
                    float[] arr = new float[no];
                    for(int i = 0;i < no;i++){
                        arr[i] = sc.nextFloat();
                    }
                    float minimum = obj1.min(arr);
                    System.out.println("Minimum element is : "+ minimum);
                    float maximum = obj1.max(arr);
                    System.out.println("Maximum element is : "+ maximum);
                    float sum = obj1.sum(arr);
                    System.out.println("sum of elements in array is : "+ sum);
                    float avg = obj1.average(arr);
                    System.out.println("Average of elements in array is : "+ avg);
                }
                case 3 -> {

                    System.out.println("Enter the two numbers : ");
                    float a = sc.nextFloat();
                    float b = sc.nextFloat();
                    obj2.setData(a,b);

                    float addition = obj2.addition();
                    System.out.println("Addition is "+ addition);
                    float subtraction = obj2.subtraction();
                    System.out.println("Subtraction is "+ subtraction);
                    float multiplication = obj2.multiplication();
                    System.out.println("Multiplication is "+ multiplication);
                    float division = obj2.division();
                    System.out.println("Division is "+ division);
                }
                case 4 -> {
                    flag = false;
                }
                default -> System.out.println("Enter the valid choice...!!!!");
            }
        }

    }
}