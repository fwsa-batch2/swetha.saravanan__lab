import java.util.Scanner;
import java.util.Arrays;
public class substring {

    public static String getSmallestAndLargest(String s, int k) {
        char[] arr = s.toCharArray();
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(arr);
        int ans =arr.length%k;
       
        if(ans!=0) {
            for(int i=0;i<arr.length; ){
               String str=s.substring(i,i+k);
               System.out.println(str);
            }

        }
        
       return null;
       
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}