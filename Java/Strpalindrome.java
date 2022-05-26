import java.util.Scanner;

public class Strpalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char ch;
        String Answer= " ";
        for(int i=0; i<A.length(); i++) {
           ch = A.charAt(i);
           Answer=ch+Answer;
        }
        System.out.println(Answer);
        if(Answer==A) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
