package com.pack;
import com.Swetha.Encapsulation;
public class Example {
    int x;
}

class subclass extends com.Swetha.Encapsulation {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.d);
}
}
class Exp {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.d);
    }
}