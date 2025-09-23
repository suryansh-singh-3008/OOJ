import java.util.*;
public class quadratic
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float r1,r2=0;
        System.out.println("Suryansh Singh 1BF24CS309");
        System.out.println("Enter value of a: ");
        a=sc.nextInt();
        System.out.println("Enter value of b: ");
        b=sc.nextInt();
        System.out.println("Enter value of c: ");
        c=sc.nextInt();
        if(a==0)
        System.out.println("Invalid input");
        else{
            float d=b*b-(4*a*c);
            if(d==0){
                r1=(-b)/(2*a);
                System.out.println("root is real and equal: "+r1);

            }
            else if(d>0){
                r1=((-b)+((float)Math.sqrt(d)))/(2*a);
                r2=((-b)-((float)Math.sqrt(d)))/(2*a);
                System.out.println("roots are real and distinct");
                System.out.println("1st root  "+r1);
                System.out.println("2nd root " +r2);
            }
            else{
                r1=(-b)/(2*a);
                r2=(float)Math.sqrt(-d)/(2*a);
                System.out.println("roots are imaginary and distinct");
                System.out.println("The first root is :"+r1+"+"+r2+"i");
                System.out.println("The first root is :"+r1+"-"+r2+"i");

            }
        }
    }

}