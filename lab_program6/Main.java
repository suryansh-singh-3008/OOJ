import SEE.Externals;
import java.util.*;
class Main{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students");
         n=sc.nextInt();
        
        for(int i=0;i<n;i++){
        Externals we=new Externals();
        we.input_details();we.inputCIEmarks();we.inputSEEmarks();we.calculateFinalMarks();
        we.display_marks();}

    }
}