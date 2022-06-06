public class Chain {
    Chain(){
        this(2);
        System.out.println("Without parameter");
    }
    Chain(int x){
        this(2,3);
        System.out.println("One parameter");
    }
    Chain(int x , int y){
        System.out.println("Double parameter");
    }
    public static void main(String[] args) {
        Chain obj =new Chain();
    }
}
