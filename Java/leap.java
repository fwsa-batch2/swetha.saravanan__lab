import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter year to check whether Leap year or not :");
        int year = no.nextInt();
        if(year%4==0) {
            System.out.println(year + " is Leap year");
        }
        else {
            System.out.println( year+ " is not Leap year");
        }
        no.close();
    }
}
