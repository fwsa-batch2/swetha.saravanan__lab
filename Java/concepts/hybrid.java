//package concepts;
//interface first {
//    void first();
//}
//interface second {
//    void second();
//}
//interface fourth extends first, second {
//    void third();
//}
//
//public class hybrid implements no3{
//    public void first() {
//        System.out.println("Hybrid Inheritance");
//    }
//
//    @Override
//    public void second() {
//        System.out.println("I am the second statement");
//
//    }
//
//    @Override
//    public void statement3() {
//
//    }
//
//    @Override
//    public void third() {
//       System.out.println("I am third statement");
//
//    }
//}
//class A extends hybrid {
//    public void fourth() {
//        System.out.println("I am the child of hybrid");
//    }
//}
//class B extends A {
//    public void fifth() {
//        System.out.println("Multilevel Inheritance");
//    }
//    public static void main(String[] args) {
//        B obj = new B();
//        obj.first();
//        obj.second();
//        obj.third();
//        obj.fourth();
//        obj.fifth();
//
//    }
//}