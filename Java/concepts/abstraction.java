package concepts;
abstract class action{
abstract void datahide();
abstract void types();
abstract void visible();
void example() {
    System.out.println("SMS");
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
   }
}
