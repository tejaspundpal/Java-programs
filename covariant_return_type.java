class first
{
    first method()
    {
        return this;
    }
    void display()
    {
        System.out.println("Hi from class first");
    }
}
class second extends first
{

    second method()
    {
        return this;
    }
    void display()
    {
        System.out.println("Hi from class second");
    }
}
class third extends second
{

    third method()
    {
       // first f = new first();
       // f.method().display();
        return this;
    }
    void display()
    {
        System.out.println("Hi from class third");
    }
}
public class covariant_return_type {
    public static void main(String[] args) {
        third t3 = new third();
        t3.method().display();

        first t1 = new third();
        t1.method().display();

        // ((third)t3.method()).display();

    }
}
