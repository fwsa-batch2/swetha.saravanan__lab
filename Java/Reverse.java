import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner no=new Scanner(System.in);
        System.out.println("Enter a number to Reverse :");
        int Num=no.nextInt();
        int length;
        char ch;
        String result="";
        String digit = Integer.toString(Num);
        length=digit.length();
        System.out.println(length);
        for(int i=0; i<length; i++) {
            ch=digit.charAt(i);
            result=ch+result;
        }
        int ReversedNum = Integer.parseInt(result);
        System.out.println(ReversedNum);
        no.close();
    }
}
