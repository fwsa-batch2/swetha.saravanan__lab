package concepts;

 interface example {
       void sleep();
       void eat();    
}

public class animal implements example {
    public void sleep() {
        System.out.println("12 Hours");
    }
    public void eat() {
        System.out.println("Meat");
    }
    void action() {
        System.out.println("Hunting");
    }
}
class Human implements example{
    public void sleep() {
        System.out.println(" 8 Hours");
    }
    public void eat() {
        System.out.println("Natural foods");
    }
    void action() {
        System.out.println("Walking and working");
    }
}
class output {
public static void main(String[] args) {
   animal obj=new animal();
   Human obj1=new Human();
   obj.sleep();
   obj.eat();
   obj.action();
   obj1.eat();
   obj1.sleep();
   obj1.action();
}
}