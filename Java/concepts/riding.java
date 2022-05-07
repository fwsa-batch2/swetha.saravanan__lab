package concepts;


class Answer {
    public static void main(String[] args) {
        riding.area();
        overloading.area();
    }
}
public class riding {
    static int area() {
        System.out.println("Same method name in different classes");
        return 0;
    }
}
class overloading extends riding {
    static int area() {
        System.out.println("Same method name but different parameters");
        return 0;
    }

}
