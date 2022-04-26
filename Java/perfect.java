import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner No=new Scanner(System.in);
        System.out.println("Enter a Number to check Perfect or not :");
        int Num=No.nextInt();
        System.out.println(Num);
        int result=0;
        for(int i=1; i<Num; i++){
           if(Num%i==0) {
              result=result+i; 
              System.out.println(result);
            }}
           if(result==Num) {
               System.out.println("Given no is Perfect number");
           }
           else {
               System.out.println("Given no is not Perfect number");
           }
           

        No.close();
        }
    }

