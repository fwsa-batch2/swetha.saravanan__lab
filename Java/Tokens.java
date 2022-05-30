// import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Tokens {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // StringTokenizer obj=new StringTokenizer(s);
        Pattern p=Pattern.compile("[!,?._'@\\s]+]");
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
        
        // System.out.println(obj.countTokens());
        // for(int i=0; i<obj.countTokens(); i++){
        //     System.out.println(obj.nextToken());
        // }
        scan.close();
    }
}

