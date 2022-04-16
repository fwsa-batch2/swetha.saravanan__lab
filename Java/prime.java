import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner Num=new Scanner(System.in);
        System.out.println("Enter a Number to check Prime or not");
        int No=Num.nextInt();
        if(No==2||No==3||No==5) {
           System.out.println("The Given number is prime");
        }
        else if((No%2==0)||(No%3==0)||(No%5==0)){
            System.out.println("The Given number is not prime"); 
        }
        else {
            System.out.println("The Given number is prime");
        }
    }
}
