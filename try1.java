import java.util.*;
public class try1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String InputValue;
        String name[] = new String[6];
        int number[] = new int[6];
        String LargeName = "";
        int largest = 0;
        int as = 3;

        for (int x = 1; x <= as; x++) {
            System.out.print(" Name & number : ");
            InputValue = in.nextLine();
            String[] Value = InputValue.split(" ");
            name[x] = Value[0];
            number[x] = Integer.parseInt(Value[1]);
        }

        for (int x = 1; x < number.length; x++) {
            if (number[x] > largest) {
                largest = number[x];
                LargeName = name[x];
            }
        }
        System.out.println("Result = " + LargeName + " " + largest);
    }
}
