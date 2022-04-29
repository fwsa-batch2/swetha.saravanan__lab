package com.Swetha;
public class encapsulated {
   public int x=10;
   protected int y=20;
   int z=10;
}
 class subclass extends encapsulated {
    public static void main(String[] args) {
        encapsulated obj=new encapsulated();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
      //   System.out.println(obj.password);
    } 
   }
class sub {
   
   public static void main(String[] args) {
   encapsulated obj=new encapsulated();
   System.out.println(obj.x);
   System.out.println(obj.y);
   System.out.println(obj.z);
   // System.out.println(obj.password);
   }
}
