package concepts;

import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println("Sum of the two numbers : "+add(a,b));
        System.out.println("Sum of three numbers : " +add(a,b,c));
        scan.close();
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
}
