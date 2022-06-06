
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        char[] array ={'1','2','3','4'};
        for(int i=0; i<array.length-1; i++) {
            // if(i==0){
            //     array[i]=array[i+1];
            // }
            // else if(i%2==0){
            //     array[i]=array[i+1];
            // }
            // else {
            //     array[i]=array[i+1];
            // }
            array[i]=array[i+1];
        }
        System.out.println(array);
        // Arrays.sort(array);
        // System.out.println("Smallest element :"+array[0]);
        // System.out.println("Largest element :" +array[array.length-1]);


    }

    
}