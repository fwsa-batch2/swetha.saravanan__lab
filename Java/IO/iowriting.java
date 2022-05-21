package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class iowriting {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("//home//swetham//swetha.saravanan__lab//Java//IO//io.txt");
        fileWriter.write("Hello Swetha");
        fileWriter.append("S");
        fileWriter.close();
        File file=new File("//home//swetham//swetha.saravanan__lab//Java//start.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.createNewFile());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.mkdir());
        System.out.println(file.list());
        System.out.println(file.renameTo(file));

        scan.close();
    }
}
