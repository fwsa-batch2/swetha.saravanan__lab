import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner Num=new Scanner(System.in);
        System.out.println("Enter a Number to check Prime or not");
        int No=Num.nextInt();
        int count=0;
        for(int i=1; i<=No; i++) {
              if(No%i==0) {
                  count++;
              }
            }
            if(count==2) {
                System.out.println("Given no is Prime number");
            }
            else {
                System.out.println("Given no is not Prime number");
            }
        
        Num.close();
    }
}
