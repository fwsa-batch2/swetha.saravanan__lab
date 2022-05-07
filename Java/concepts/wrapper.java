package concepts;

public class wrapper {
    public static void main(String[] args) {
    int a=10;
    Integer obj=Integer.valueOf(a);
    Integer obj1=a;
    char ch='a';
    Character obj2=Character.valueOf(ch);
    Character obj3=ch;
    System.out.println("Primitive Datatype to Object ");
    System.out.println("Boxing : "+obj);
    System.out.println("AutoBoxing : " +obj1);
    System.out.println("Charactor Boxing : " +obj2);
    System.out.println("Character AutoBoxing : " +obj3);
    System.out.println("Int + Int : "+obj+obj1);
    System.out.println("Int + Char : " +obj+obj2);
    System.out.println(a+ch);
    System.out.println("Object to Primitive Datatype");
   
    }
    
    
}
