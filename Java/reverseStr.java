import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str = input.next();
        String str1=new StringBuilder(str).reverse().toString();
        if(str1.equals(str)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        input.close();
    }
}
