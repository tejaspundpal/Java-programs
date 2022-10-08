import java.util.*;
class triangle
{
    Scanner sc = new Scanner(System.in);
    double base;
    double area = 0;
    double height;
    void getData()
    {
        System.out.println("Enter base: ");
         base = sc.nextDouble();
        System.out.println("Enter height: ");
         height = sc.nextDouble();
    }

    void showData()
    {
        area =  (0.5 * base * height);
        System.out.println("Area = "+area);
    }
}
public class area
{
    public static void main(String[] args)
    {
        triangle tr = new triangle();
        tr.getData();
        tr.showData();
    }
}
