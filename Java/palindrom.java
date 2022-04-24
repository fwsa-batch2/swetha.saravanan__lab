import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrom or not");
        int no =input.nextInt();
        String num=Integer.toString(no);
        char ch;
        String Ans="";
        for(int i=0; i<num.length(); i++) {
        ch=num.charAt(i);
        Ans=ch+Ans;
        }
        System.out.println(Ans);
        int reverse = Integer.parseInt(Ans);
        if(reverse==no) {
            System.out.println(no+" is Palindrom");
        }
        else {
            System.out.println(no+" is not Palindrom");
        }
        input.close();
    }
}
