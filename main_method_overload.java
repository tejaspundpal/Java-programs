public class main_method_overload
{
    public static void main(String[] args){
        System.out.println("main with String[]");
        main("Hello");
        main();
    }
    public static void main(String args){
        System.out.println(args);
        System.out.println("main with String");
    }
    public static void main(){
        System.out.println("main without args");
    }

}
