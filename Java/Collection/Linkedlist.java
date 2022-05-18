package Collection;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        obj.add(1);
        obj.add(0, 1);
        obj.addFirst(3);
        obj.addLast(2);
        obj.push(9);
        obj.push(10);
        obj.push(11);
        System.out.println(obj);
        System.out.println("Element() method is used to return the first value of the object :"+obj.element());
        System.out.println(obj.hashCode());
        System.out.println("It will check whether it is there or not :"+obj.contains(1));
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        System.out.println(obj.get(0));
        System.out.println("The first element of the list :"+obj.peekFirst());
        obj.set(1, 97);
        System.out.println(obj);
    }
}
