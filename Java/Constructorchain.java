public class Constructorchain {
    Constructorchain() {
        this(2);
        System.out.println("I am No-arg Constructor");
    }
    Constructorchain(int x) {
        this("Swetha",17);
        System.out.println("X value is " +x);
        System.out.println("I am Single Parametrized Constructor");
    }
    Constructorchain(String name , int x) {
        System.out.println("My name is " +name);
        System.out.println("I am Double Parametrized Constructor"+x);
    }
    public static void main(String[] args) {
        new Constructorchain();
    }
}