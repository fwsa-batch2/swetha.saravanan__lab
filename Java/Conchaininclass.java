public class Conchaininclass {
    Conchaininclass() {
        System.out.println("I am  No-arg Constructor in Conchaininclass");
    }
    Conchaininclass(int x) {
        System.out.println("Single Parametrized Constructor");
    }
    Conchaininclass(String name , int x) {
        System.out.println("Double Parametrized Constructor");
    }}
    class Super extends Conchaininclass {
    Super() {
        System.out.println("Zero arg Constructor");
    }
    Super(int x)  {
        System.out.println("One Arg Constructor");
    }
    Super(String name , int x) {
        System.out.println("I am here to Confuse you");
    }
    public static void main(String[] args) {
        new Conchaininclass(2);
        new Conchaininclass("Swetha",17);
        new Conchaininclass();
    }}
