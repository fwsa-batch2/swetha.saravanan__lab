import java.lang.Thread;
public class Singleton extends Thread{
    Singleton(){
        System.out.println("Method running");
    }
    public synchronized void run(){
        System.out.println("Run");
    }
    private static Singleton obj;
    public static void main(String[] args) {
        Singleton.getInstance();
        

    }
    public static Singleton getInstance(){
        if(obj==null){
            obj = new Singleton();
            for(int i=1; i<=2; i++){
                obj.run();
            }
            
        }
        return Singleton.obj;
    }
}
