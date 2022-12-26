import java.util.*;
import static java.lang.Math.*;
public class Tsk5Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double e1=0.01, e2=0.001, e3=0.0001;
        System.out.println("Pls,enter the |x|>1");
        double x =scan.nextDouble();
        if (abs(x)>1) {
            System.out.println(summ(e1, x));
            System.out.println(summ(e2, x));
            System.out.println(summ(e3, x));
        }
        else {
            System.out.println("Something went wrong,pls restart");
        }

    }
    public static double summ(double e,double x) {
        System.out.println("Inaccuracy = "+e);
        int n=0;
        double sum=0;
        while ((abs(atan(x)-((PI/2)+sum)))>e) {
            sum += (pow(-1,n+1))*(1d/(((2*n)+1)*(pow(x,((2*n)+1)))));
            n++;
        }
        return PI/2+sum;
    }
}