package Collection;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<>();
        for(int i=1; i<=10; i++) {
            obj.add(i);
        }
        TreeSet<Integer> obj1 = new TreeSet<>();
        for(int i=1; i<=5; i++) {
            obj1.add(i);
        }
        System.out.println(obj);
       obj.add(1);
       System.out.println(obj);
        obj.addAll(obj1);
        System.out.println("Union :"+obj);
        obj.retainAll(obj1);
        System.out.println("Intersection :"+obj);
       obj.removeAll(obj1);
       System.out.println("Difference :"+obj);
        
    }
}
