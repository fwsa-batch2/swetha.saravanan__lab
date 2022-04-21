import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter a number to check Odd or Even :");
        int Num=no.nextInt();
        if(Num%2==0) {
            System.out.println("Given number is Even number");
        }
        else {
            System.out.println("Given number is Odd number");
        }
        no.close();
    }
}
