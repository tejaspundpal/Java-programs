interface parent1
{
    void display();
}
interface child1 extends parent1{
    void display1();
}
class child2 implements child1{
    public void display(){
        System.out.println("parent1");
    }
    public void display1(){
        System.out.println("child1");
    }
}
class child3 extends child2
{
    void display2()
    {
        System.out.println("child3");
    }
}
public class interface_extend {
    public static void main(String[] args) {
//        child2 obj = new child2();
//        obj.display();
//        obj.display1();
         child2 obj1 = new child3();
         obj1.display1();
         obj1.display();
         //obj1.display2(); ---> not allowed

    }
}
