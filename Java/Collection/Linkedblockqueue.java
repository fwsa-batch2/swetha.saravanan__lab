package Collection;
import java.util.concurrent.LinkedBlockingQueue;

public class Linkedblockqueue {
    public static void main(String[] args) {
     LinkedBlockingQueue<Integer> obj = new LinkedBlockingQueue<Integer>();
        for(int i=1; i<=10; i++) {
            obj.add(i);
        }
        System.out.println(obj);
        System.out.println(obj.add(1));
        System.out.println(obj.contains(2));
        System.out.println(obj.offer(1));
        System.out.println(obj.offer(5));
        System.out.println(obj.size());
    }
}
