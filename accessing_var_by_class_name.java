import org.w3c.dom.ls.LSOutput;

class practice{
    int x = 10;
    static int y = 20;
    void display()
    {
        System.out.println("Hello Tejas");
    }
}
public class accessing_var_by_class_name
{
    public static void main(String[] args)
    {
        practice p = new practice();
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(practice.y);

    }
}
