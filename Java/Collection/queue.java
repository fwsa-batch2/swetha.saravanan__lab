package Collection;

import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> obj=new PriorityQueue<Integer>();
        for(int i=1; i<=10; i++) {
              obj.add(i);
        }
        System.out.println(obj);
        System.out.println(obj.contains(3));
        System.out.println(obj.offer(5));
        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj.remove());
    }
   
}
