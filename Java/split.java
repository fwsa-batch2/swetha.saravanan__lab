public class split {
    public static void main(String[] args) {
        StringBuffer newStr = new StringBuffer();
        System.out.println(newStr.capacity());
        newStr.append("String Buffer is easy to understand");
        System.out.println(newStr.capacity());
        newStr.ensureCapacity(40); //35*2 +2
        System.out.println(newStr.capacity());


    }
}
