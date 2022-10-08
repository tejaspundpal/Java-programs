import java.util.*;
class parent_example
{
    int a = 10;
    int b = 15;
    final int c = 20;
    static int t = 25;
    private int x = 50;
    void display()
    {
        System.out.println("Hi from class parent_example");
    }
    void method1()
    {
        System.out.println("Hi from class parent_example and method1");
    }
    static void static_display()
    {
        System.out.println("Hi from class parent_example and static method");
    }
    void case1_display()
    {
        System.out.println("hi from case1_display and parent_example");
    }
}
class child_example extends parent_example
{
    int a = 30;
    int c = 35;
    int d = 40;
    void display()
    {
        System.out.println("Hi from class child_example");
    }
    void method2()
    {
        System.out.println("Hi from class child_example and method2");
    }
    static void static_display()
    {
        System.out.println("Hi from class child_example and static method");
    }
//    static void case1_display()
//    {
//        System.out.println("hi from case1_display and child_example");
//    }
    // we cannot override instance method with static method and static method with instance method
    // but when in both methods are static they override and it is called as method hiding
}
public class upcasting_clg
{
    public static void main(String[] args) {
        parent_example pp = new parent_example();
        parent_example p = new child_example();
        child_example c = new child_example();
        //child_example cc = new parent_example(); ------> not allowed
        p.display();
        p.method1();
        //p.method2(); ---> not allowed
        //child_example.static_display(); ---> allowed
        //parent_example.static_display(); ---> allowed
        pp.static_display();
        p.static_display();
        c.static_display();

        System.out.println("a = "+p.a);
        System.out.println("b = "+p.b);
        System.out.println("c = "+p.c);
        System.out.println("t = "+p.t);
        System.out.println("t = "+parent_example.t);
        //System.out.println("t = "+p.x); ---> not allowed
    }
}