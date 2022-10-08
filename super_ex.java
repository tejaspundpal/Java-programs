class animal{
    String color = "black";
}
class dog extends animal{
    String color = "white";
    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class super_ex {
    public static void main(String[] args) {
        dog d = new dog();
        System.out.println(d.color);
        d.display();
    }
}
