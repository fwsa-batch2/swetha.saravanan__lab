package concepts;

public class multilevelih {
    public void c(){
        System.out.println("I am very old language in the world");
    }
}
class secondary extends multilevelih {
    public void python(){
        System.out.println("Interprinted Language");
    }
}
class third extends secondary {
    public void java() {
        System.out.println("One of the most popular Backend Language");
    }
    public static void main(String[] args) {
        third obj=new third();
        obj.java();
        obj.python();
        obj.c();
    }
}