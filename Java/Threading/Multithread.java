package Threading;
public class Multithread extends Thread{
    public static void main(String[] args) {
        Multithread obj = new Multithread();
        for(int i=0; i <6 ; i++){
            obj.run();
        }
    }

    public void run() {
        System.out.println("Running...");
    }
}