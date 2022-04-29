package concepts;

public class singleih {
    int num1=20;
    int num2=30;
    public int add(int num1,int num2) {
        return num1+num2;
    }
}
class math extends singleih {
    public int sub(int num1,int num2) {
        return num2-num1;
    }
    public int multiple(int num1,int num2) {
        return num2*num1;
    }
    public int divide(int num1,int num2) {
        return num2/num1;
    }
    public static void main(String[] args) {
        math obj=new math();

        System.out.println(obj.sub(2,10));
        System.out.println(obj.multiple(2,5));
        System.out.println(obj.divide(10,5));
        System.out.println(obj.add(2,4));

    }
}
