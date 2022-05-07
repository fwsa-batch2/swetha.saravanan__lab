package concepts;
abstract class action{
abstract void datahide();
abstract void types();
abstract void visible();
void example() {
    System.out.println("SMS");
} 
abstract double area(double r);
double circumference(double d) {
    return 2*3.14*d;
}
}
public class abstraction extends action{

    @Override
    void datahide() {
        System.out.println("Abstraction is only used to show the essential works");
        
    }

    @Override
    void types() {
       System.out.println("Abstraction have two kinds of Abstraction");
       System.out.println("Data Abstraction and control abstraction");
        
    }

    @Override
    void visible() {
       System.out.println("It is only visible to the developer");
        
    }
   public static void main(String[] args) {
       abstraction obj=new abstraction();
       obj.datahide();
       obj.types();
       obj.visible();
       obj.example();
       System.out.println(obj.circumference(2.1));
       System.out.println(obj.area(2.3));
   }

@Override
double area(double r) {
    
    return 3.14*(Math.pow(2,r));
}
}
