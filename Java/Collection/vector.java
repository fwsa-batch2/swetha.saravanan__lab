package Collection;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
       Vector<Integer> obj = new Vector<Integer>();
       obj.add(2);
       obj.add(0, 3);
       obj.addAll(obj);
       obj.add(5);
       obj.add(6);
       obj.add(1);
       System.out.println(obj);
       System.out.println(obj.clone());
       System.out.println("It will return values " +obj.elementAt(2));
       System.out.println("It will check whether it is there or not :" +obj.contains(2));
       System.out.println(obj.indexOf(4));
       System.out.println(obj.remove(4));
       System.out.println(obj.capacity());
    }
}
