class Swetha  {
    public void child() {
        System.out.println("Swetha is an innocent girl");
    }
}
public class Interface extends Swetha implements example{

    @Override
    public void sleep() {
        System.out.println("2 hours");
        
    }

    @Override
    public void run() {
        System.out.println("30km/h");
        
    }
    public static void eat() {
        System.out.println("meat");
    }
    public static void main(String[] args) {
        example obj = new Interface();
        eat();
        obj.sleep();
        obj.run();  
        obj.child() ;
    }
    
}

interface example {
    void sleep();
    void run();
    void child();
}