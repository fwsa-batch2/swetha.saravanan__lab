// import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Scanner;
// public class substring {

//     public static String getSmallestAndLargest(String s, int k) {
//         String smallest = s.substring(0,k);
//         String largest  = "";
//         for(int i=0;i<s.length()-k+1;i++){
//         if(s.substring(i,i+k).compareTo(smallest)<0) smallest = s.substring(i,i+k);
//         if(s.substring(i,i+k).compareTo(largest)>0) largest = s.substring(i,i+k);
//         }    
//         return smallest + "\n" + largest;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//          String s = scan.next();
//         int k = scan.nextInt();
//         scan.close();
      
//         System.out.println(getSmallestAndLargest(s, k));
//     }
// }
public class substring {
    public static void main(String[] args) {
        // Scanner scan= new Scanner(System.in);
        // String a = scan.next();
        // int i=0;
        // String b="";
        // char ch;
        // do {
        //   ch = a.charAt(i) ;
        //    b= ch +b;
        //    i++;
        // } while (i<a.length());
        // System.out.println(b);
        // scan.close();
        int[] a = {1,2,2,3,3,4};
        System.out.println(a.length);
        for (int i=0; i<a.length-1; i++){
            for(int j=1; j<a.length; j++){
                if(a[i]==a[j]){ 
                    System.out.println(a[i]);
                    
                    break;
                }
            }
        }

    }

   
   
}