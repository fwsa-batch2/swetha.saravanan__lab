public class duplicate {
    public static void main(String[] args) {
        int grade[] ={12,23,56,56,67,88};
        for(int i=0; i<grade.length; i++) {
            for(int j=i+1; j<grade.length; j++ ) {
                if(grade[i]==grade[j]) {
                   System.out.println("Duplicate no :" +grade[i]);
                }
            }
        }
    }
}
