package college_programs;
import java.util.Scanner;

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}

class Operation {
    int a;
    int b;

    Operation() {
        a = 0;
        b = 0;
    }

    int addition(int a, int b)// throws TooLongAdditionException
    {
        try {
            if ((a + b) > 1000) {
                throw new MyException("TooLongAdditionException");
            } else {
                return a + b;
            }
        } catch (MyException e) {
            System.out.println("Caught Exception...");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    int subtraction(int a, int b) // throws NegativeAnswerException
    {
        try {
            if ((a - b) < 0) {
                throw new MyException("NegativeAnswerException");
            } else {
                return a - b;
            }
        } catch (MyException e) {
            System.out.println("Caught Exception...");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    int multiply(int a, int b) // throws tooLongMultiplicationException
    {
        try {
            if ((a * b) > 5000) {
                throw new MyException("tooLongMultiplicationException");
            } else {
                return a * b;
            }
        } catch (MyException e) {
            System.out.println("Caught Exception...");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    int divide(int a, int b)// throws DividedByZeroException
    {
        try {
            if (b == 0) {
                throw new MyException("DividedByZeroException");
            }
            else if(b > a){
                throw new MyException("DenominatorIsGreaterThanNumeratorException");
            }
            else {
                return a / b;
            }
        } catch (MyException e) {
            System.out.println("Caught Exception...");
            System.out.println(e.getMessage());
        }
        return 0;
    }
}

public class Exp8_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        System.out.println("Enter 1st no : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no : ");
        int b = sc.nextInt();
        boolean check = true;
        while (check) {
            int choice;
            System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n5)Exit\n");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int ans = op.addition(a, b);
                    System.out.println("Addition : " + ans);
                    break;
                case 2:
                    int ans1 = op.subtraction(a, b);
                    System.out.println("Subtraction : " + ans1);
                    break;
                case 3:
                    int ans2 = op.multiply(a, b);
                    System.out.println("Multiplication : " + ans2);
                    break;
                case 4:
                    int ans3 = op.divide(a, b);
                    System.out.println("Division : " + ans3);
                    break;
                case 5:
                    check = false;
                default:
                    System.out.println("Invalid choice....!!");
            }
        }
    }
}