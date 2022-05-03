package concepts;

public class riding {
    void define() {
        System.out.println("Same method name in different classes");
    }
}
class overloading extends riding {
    void define() {
        System.out.println("Same method name but different parameters");
    }
}
class Answer {
    public static void main(String[] args) {
        overloading obj=new overloading();
        obj.define();
        riding obj1=new riding();
        obj1.define();
    }
}