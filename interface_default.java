interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");}
}
class interface_default implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String[] args){
        Drawable d=new interface_default();
        d.draw();
        d.msg();
    }}

