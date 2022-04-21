public class sortarray {
    public static void main(String[] args) {
        int marks[]={99,95,88,85,66,65,55,21};
        int length=marks.length;
        System.out.println(length);
        for(int i=0; i<length; i++) {
          int Answer=0;
          for(int j=i+1; j<length; j++) {
              if(marks[i]>marks[j]) {
                  Answer=marks[i];
                  marks[i]=marks[j];
                  marks[j]=Answer;
              }
          }
        System.out.println(marks[i]); 
       
        }
    }
}
