package exception;
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        Scanner scan = new Scanner(System.in);
        int no=scan.nextInt();

        try {
          if(no<18){
          System.out.println("You are Eligible");
          }

        
        }
        catch(Exception e) {
            System.out.println("You are not Eligible");
        }
        scan.close();
    }
}
