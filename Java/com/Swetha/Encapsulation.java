package com.Swetha;

public class Encapsulation {
    public int a=10;
    public int b=20;
    public int c=30;
    public int d=40;    
}
class Encapsulation1 extends Encapsulation {
    public static void main(String[] args) {
    Encapsulation obj=new Encapsulation();
    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(obj.d);
}}
class Encapsulation3 {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.d);
    }
}