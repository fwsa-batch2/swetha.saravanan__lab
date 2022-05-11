 public class test {
     public static void main(String[] args) {
         String name ="123445";
         String answer ="[0-9]+";
         if(name.matches(answer)) {
            System.out.println("Digit characters");
         }
         else {
             System.out.println("not digit characters");
         }
         }
     }
 

