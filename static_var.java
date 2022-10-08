class static_var
{
    int a = 10;
    static int b = 20;
    private static int c = 30;

    void display(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }

    public static void main(String[] args) {
        static_var s = new static_var();
        s.display();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);
    }
}
