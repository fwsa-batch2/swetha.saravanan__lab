import java.util.Scanner;

public class Lexicograpic {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
           
        char ch1=A.charAt(0);   
        char ch2=B.charAt(0);
        
        int ascii1 = (int)ch1;
        int ascii2 =(int)ch2;
        String C =A+B;
        System.out.println(C.length());
        if(ascii1<ascii2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length())+" " +B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
        sc.close();
    }
}
