import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner no=new Scanner(System.in);
        System.out.println("Enter a number to check Strong no or not :");
        int Num =no.nextInt();
        String num=Integer.toString(Num);
        int length = String.valueOf(Num).length();
        int No , Answer;
        int strongNo=0;
        char ch;
        for(int i=0; i<length; i++) {
            ch=num.charAt(i);
            No=Character.getNumericValue(ch);
            System.out.println(No);
            Answer=1;
            for(int j=1; j<=No; j++) {
              Answer=j*Answer;
            }
            strongNo=strongNo+Answer;
            System.out.println(Answer);
        } 
    
        System.out.println(strongNo);
        if(strongNo==Num) {
            System.out.println("Given number is a Strong Number");
        }
        else {
            System.out.println("Given number is not a Strong Number");
        }
    
    } }
