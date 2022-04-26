import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner no1=new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = no1.nextInt();
        Scanner no2=new Scanner(System.in);
        System.out.println("Enter Second number :");
        int b=no2.nextInt();
        calculator obj=new calculator();
        System.out.println("Sum of the numbers :" + add(a,b));
        System.out.println("Substraction of the numbers :" + sub(a,b));
        System.out.println("Multiple of the numbers :" + multiple(a,b));
        System.out.println("Division :" +divide(a,b));
        System.out.println("Exponential value of the a :" +obj.exponent(a,b));
        no1.close();
        no2.close(); 
    }
    public static int add(int x ,int y) {
        return x+y;
    }
    public static int sub(int x , int y) {
        return x-y;
    }
    public static int multiple(int x, int y) {
        
        return x*y;
    }
    public static float divide(float x , float y) {
        float result=x/y;
        return result;
    }
    public int exponent(int x,int y) {
        int Answer=1;
        for(int i=1; i<=y; i++)  {
           Answer = x*Answer;  
        }
        return Answer;
    }
   
}
