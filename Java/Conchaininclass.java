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
    class Example extends Conchaininclass {
    Example() {
        System.out.println("Zero arg Constructor");
    }
    Example(int x)  {
        System.out.println("One Arg Constructor");
    }
    Example(String name , int x) {
        System.out.println("I am here to Confuse you");
    }
    public static void main(String[] args) {
        new Example(2);
        new Example("Swetha",17);
        new Example();
    }}
