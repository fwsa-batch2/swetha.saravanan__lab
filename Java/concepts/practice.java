package concepts;
public class practice {
    int a=90;
    practice() {
        System.out.println("I am a Constructor");
    }
    public static void main(String[] args) {
        practice obj = new practice();
        System.out.println(obj.a);
    }
}
