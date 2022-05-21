package Collection;

import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> obj = new LinkedHashMap<>();
        obj.put(1,"Harry");
        obj.put(2,"Hermoinie");
        obj.put(3,"John");
        obj.put(4,"Steve");
        obj.put(5,"Potter");
        obj.put(6,"Rohn");
        System.out.println(obj);
        System.out.println("Keys :"+obj.keySet());
        System.out.println("Values :" +obj.values());
        obj.remove(5);
        System.out.println(obj);
        System.out.println(obj.containsKey(4));
        System.out.println(obj.containsValue("Shravan"));
        System.out.println(obj.size());
    }
}
