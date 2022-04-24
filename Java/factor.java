import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number to find that factors :");
        int no=input.nextInt();
        int count=0;
        for(int i=1; i<=no; i++) {
            
            if(no%i==0) {
              count++;
            }}
            System.out.println("Factors of "+no+ " is " +count);
            input.close();
        }
        
    }

