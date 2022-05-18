package Collection;

import java.util.ArrayDeque;

public class Arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> obj = new ArrayDeque<>();
        for(int i=1; i<=10; i++) {
            obj.add(i);
        }
        System.out.println(obj);
        System.out.println(obj.add(1));
        System.out.println(obj.contains(2));
        System.out.println(obj.offerFirst(1));
        System.out.println(obj.offerLast(4));
        System.out.println(obj.offer(5));
        System.out.println(obj.size());
    }
}
