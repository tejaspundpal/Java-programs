class Demo
{
    int a = 15;
    static int b = 25;
    private static int c = 35;

    static void display(Demo obj){
        System.out.println("a = "+obj.a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }

}
public class static_var1
{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display(d);
         System.out.println(d.a);
         System.out.println(d.b);
        // System.out.println(c); --> cannaot accessible private member
    }
}
