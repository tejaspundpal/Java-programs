class Parent {
    public static void staticMethod() {
        System.out.println("Parent: inside staticMethod");
    }
}
public class Child extends Parent {
    //overriding the static method
    public static void staticMethod() {
        System.out.println("Child: inside staticMethod");
    }

    public static void main(String []args) {

        Parent ParentWithParent = new Parent();
        Parent ParentWithChild = new Child();
        Child ChildWithChild = new Child();

        ParentWithParent.staticMethod();
        ParentWithChild.staticMethod();
        ChildWithChild.staticMethod();

    }
}