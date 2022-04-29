import java.util.ArrayList;
public class arraylist {
   public static void main(String[] args)  {
       ArrayList<Integer> marks=new ArrayList<Integer>();
       marks.add(99);
       marks.add(99);
       marks.add(99);
       marks.add(88);
       marks.add(88);
       marks.add(88);
       marks.add(77);
       marks.add(77);
       marks.add(77);
       System.out.println(marks);
       int length=marks.size();
       System.out.println(length);
       for(int k=0; k<length; k++) {
       for(int i=0; i<length; i++){
           for(int j=i+1; j<length; j++) {
               if(marks.get(i)==marks.get(j)) {
                      marks.remove(marks.get(i));
               }
            }
       }
       }
      System.out.println(marks);
    }}
