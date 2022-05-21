package concepts;
import java.lang.Thread;
public class thread  implements Runnable {
    public void run() {
        System.out.println("I am thread class");
    }
    public static void main(String[] args) {
       Runnable obj =new thread();
       ((Thread) obj).start();
    }

    
}
