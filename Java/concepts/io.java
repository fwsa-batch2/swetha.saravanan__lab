package concepts;

import java.io.File;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws IOException {
        File file = new File("//home//swetham//swetha.saravanan__lab//Java//start.txt");
        if(file.createNewFile()) {
            System.out.println("Created...");
        }
        else {
            System.out.println("Not created...");
        }
    }
}
