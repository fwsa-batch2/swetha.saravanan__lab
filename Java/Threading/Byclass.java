package Threading;

public class Byclass extends Thread{
    public void run() {
        System.out.println("Threading by class");
    }
    public static void main(String[] args) {
        Byclass obj=new Byclass();
        obj.start();
    }
}
