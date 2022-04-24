import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner no1=new Scanner(System.in);
        System.out.println("Enter a number to find that table :");
        int no=no1.nextInt();
        Scanner limit=new Scanner(System.in);
        System.out.println("Enter the limitation of lines :");
        int limitation=limit.nextInt();
        System.out.println("Table of " +no + "is ");
        int Answer;
           for(int i=1; i<=limitation; i++) {
                Answer=1;
                Answer=no*i;
                System.out.println( i +" * "+ no + " = " +Answer);
           }
        no1.close();
        limit.close();
    }
    }

