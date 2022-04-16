import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
       Scanner no = new Scanner(System.in);
       System.out.println("Enter a number to check whether it is Armstrong or not :");
       int Num = no.nextInt();
       String num=Integer.toString(Num);
       int length = String.valueOf(Num).length();
       int digit=1;
       char ch;
       int armstrong=0;
       System.out.println(length);
       for(int i=0; i<length; i++) {
           ch = num.charAt(i);
           System.out.println(ch);
           digit = Character.getNumericValue(ch);
           System.out.println(digit);
           int Answer=1;
           for(int j=1; j<=length; j++) {
           Answer=Answer*digit;
           }
           armstrong=armstrong+Answer;   
           System.out.println(Answer);
        }
        System.out.println(armstrong);
        if(armstrong==Num) {
            System.out.println("Given No is an Armstrong number");
        }
        else {
            System.out.println("Given No is not an Armstrong number");
        }
    }}