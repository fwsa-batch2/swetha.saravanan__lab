package Collection;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> obj = new LinkedHashSet<>();
        for(int i=1; i<=10; i++) {
            obj.add(i);
        }
        LinkedHashSet<Integer> obj1 = new LinkedHashSet<>();
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
