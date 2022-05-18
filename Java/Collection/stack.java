package Collection;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        for(int i=1; i<=10; i++) {
            obj.add(i);
        }
        System.out.println(obj);
        System.out.println(obj.clone());
        System.out.println(obj.contains(2));
        System.out.println(obj.indexOf(7));
        System.out.println(obj.size());
        System.out.println(obj.search(5));
        System.out.println(obj.toArray());
        System.out.println(obj.hashCode());
    }
}
