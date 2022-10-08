class A
{
    int x = 10;
    A(){
        System.out.println("base class const.");
    }
    A(int a)
    {
        System.out.println("parameterised const in base class and a = "+a);
    }
}
class B extends A{
    B(){
        //super(15);
        System.out.println("derived class const");
    }
    B(int a,int b)
    {
        super(a);
        System.out.println("parameterised const in derived class and b = "+b);
    }
    void display()
    {
        System.out.println("x="+x);
    }
}
public class inheritance_and_const {
    public static void main(String[] args) {
        //B obj = new B();
        B obj = new B(10,15);
        obj.display();
    }
}
