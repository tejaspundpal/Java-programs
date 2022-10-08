abstract class Bike{
    abstract void run();
}
class abstract_class extends Bike{
    void run(){System.out.println("running safely");}
    public static void main(String[] args){
        Bike obj = new abstract_class();
        obj.run();
    }
}  