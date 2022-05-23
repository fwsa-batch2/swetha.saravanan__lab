package Threading;

public class ByInterface implements Runnable{
    public void run() {
        System.out.println("Runnable Interface");
    }
    public static void main(String[] args) {
       ByInterface obj=new ByInterface();
       Thread obj1=new Thread(obj);
       obj1.start();
    }
}
