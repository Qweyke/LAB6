import java.util.*;
import static java.lang.Math.*;
public class Tsk1Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls, enter the required number of elements");
        double N = scan.nextDouble();
        System.out.println("Pls, enter the required value of M-number");
        double M = scan.nextDouble();
        double x = sin(1), sumM=0, S = 0;
        int i;
        for (i=1;i<=N;i++) {
            System.out.println("The number of the iteration is " +i);
            S = S + 1/x;
            System.out.println("The sum of the first elements ="+S);
            if (1/x<M) {
                sumM = sumM + 1 / x;
                System.out.println("The sum of the M-elements = " + sumM);
            }
            x = sin(x);
        }
    }
}
