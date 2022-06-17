package exception;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int no = sc.nextInt();
        int Factorial =1;
        for(int i=1; i<=no; i++) {
           Factorial = i*Factorial;
        }
        System.out.println("Factorial of the " + no + " is " + Factorial);
        sc.close();
    }}