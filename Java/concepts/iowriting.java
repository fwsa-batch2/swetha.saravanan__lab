package concepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class iowriting {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("//home//swetham//swetha.saravanan__lab//Java//start.txt");
        fileWriter.write("Hello Swetha");
        fileWriter.append("S");
        fileWriter.close();
        File file=new File("//home//swetham//swetha.saravanan__lab//Java//start.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}
