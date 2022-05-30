import java.util.Scanner;
import java.util.regex.*;

public class Regex
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		if(testCases>0){
            for(int i=0; i<=testCases; i++){
                String pattern=in.nextLine();
                try {
                Pattern p =Pattern.compile(pattern);
                p.matcher("[]");
                System.out.println("Valid");
                }
                catch(PatternSyntaxException e){
                    System.out.println("Invalid");
                }
                
            }
        }
	in.close();	
}

}
