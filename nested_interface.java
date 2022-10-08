interface ParentClass{
    void display();
    interface ParentClass1{
        void msg();
    }
}
public class nested_interface implements ParentClass.ParentClass1 {
    public void display()
    {
        System.out.println("\nHi from display method");
    }
    public void msg()
    {
        System.out.println("\nHi from msg method");
    }

    public static void main(String[] args) {
        ParentClass.ParentClass1 obj = new nested_interface();
        //obj.dispay(); -----> cannot acccessible
        obj.msg();
    }
}
