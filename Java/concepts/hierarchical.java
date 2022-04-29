package concepts;

public class hierarchical {
    public void statement()  {
        System.out.println("Hierarchical Inheritance : ");
        System.out.println("One parent : many children");
    }
}
class child1 extends hierarchical {
    public void child() {
        System.out.println("I am the first child of Hierarchical");
    }
}
class child2 extends hierarchical {
    public void child() {
        System.out.println("I am the second child of Hierarchical");
    }
    public static void main(String[] args) {
        child2 obj=new child2();
        obj.child();
        obj.statement();
        child1 obj1=new child1();
        obj1.child();
        obj1.statement();
    }
}
