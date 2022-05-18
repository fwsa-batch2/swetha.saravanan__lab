package Collection;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> obj = new HashSet<>();
        for(int i=1; i<=10; i++) {
            obj.add(i);
        }
        HashSet<Integer> obj1 = new HashSet<>();
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
