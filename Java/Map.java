import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<>();
        obj.put(1,"Swetha");
        obj.put(2,"Karthika");
        obj.put(3,"Jerusheya");
        obj.put(4,"Abisha");
        obj.put(5,"Shravan");
        obj.put(6,"Raju");
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
