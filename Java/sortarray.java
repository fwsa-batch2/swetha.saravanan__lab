public class sortarray {
    public static void main(String[] args) {
        int marks[]={99,95,88,85,66,65,55,56};
        int length=marks.length;
        System.out.println("Length of the array " +length);
        for(int i=0; i<length; i++) {
            for(int j=1; j<length; j++) {
                if(marks[i]>marks[j]) {
                System.out.println(marks[j]);
                break;
              }   
          }
        }
       
    }
}
