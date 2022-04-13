import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner no=new Scanner(System.in);
        System.out.println("Enter the limitation of the lines : ");
        int Num=no.nextInt();
        int a , b, c;
        a=0;
        b=1;
        for(int i=0; i<=Num; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            
        }
    }
}
