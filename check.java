public class check
{
    static void add(double d1,double d2){
        System.out.println("5.0");
    }
    static void add(Double d1,Double d2){
        System.out.println(d1 + d2);
    }

    public static void main(String[] args) {
        add(10.0,null);
    }
}
