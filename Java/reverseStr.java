import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word to reverse :");
        String str=input.next();
        int length=str.length();
        System.out.println(length);
        String reverse="";
        char ch;
        for(int i=0; i<length; i++) {
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("Reversed String :" +reverse);
        input.close();
    }
}
