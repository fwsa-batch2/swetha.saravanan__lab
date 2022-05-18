package Collection;
import java.util.ArrayList;
import java.util.Arrays;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("Swetha");
        obj.add("Abisha");
        obj.add("Jerusheya");
        obj.add("Aswath");
        obj.add("Suguram");
        obj.add(1, "Venkat");//It is used to add element in specified index
        obj.set(2, "Haiden");
        System.out.println(obj);
        Object obj2 = obj.clone();
        System.out.println(obj2);
        obj.addAll(Arrays.asList(new String[]{"Santhanu","Keerthu"}));// It is used to store add new array
        System.out.println(obj);
        System.out.println(obj.contains("Swetha"));//It is used to check whether the element
        System.out.println("Removing element of Specified index : "+ obj.remove(0));
        System.out.println("Getting element of specified index : "+obj.get(1));
        Object[] obj3=obj.toArray();
        System.out.println(obj3);
        System.out.println("Total size of the Arraylist : "+ obj.size());
        System.out.println("Sublist of an object : " +obj.subList(2,5));// creating sublist of an object
    }
}
