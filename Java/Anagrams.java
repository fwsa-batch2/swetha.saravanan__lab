import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        char[] char1=a.toLowerCase().toCharArray();
        char[] char2=b.toLowerCase().toCharArray();
        java.util.Arrays.sort(char1);
        java.util.Arrays.sort(char2);
        boolean result = java.util.Arrays.equals(char1, char2);
        return result;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
