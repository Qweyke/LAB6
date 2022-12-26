import java.util.*;
import static java.lang.Math.*;
public class Tsk3Lab6 {
    public static void main(String[] args) {
        System.out.println("Pick a number for the required part of the task, from 1 to 3");
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        if (a==1) {
            System.out.println(v1());
        }
        else if (a==2) {
            System.out.println(v2());
        }
        else if (a==3) {
            System.out.println(v3());
        }
        else {
            System.out.println("Pls restart");
        }
        }
    public static String v1() {
        int j, i;
        double Sj=0, Si=0;
        for (i=1;i<=8;i++) {
            for (j=1;j<=8;j++) {
                if (j!=i) {
                    Sj += (j * j);
                }
                Sj=Sj+0;
            }
            Si+=Sj;
            Sj=0;
            System.out.println(Si);
        }
    return "end";
    }
    public static String v2() {
        int j, i;
        double Pj = 1, Si = 0;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 3; j++) {
                Pj*= ((pow(j, 3)) + (i * i));
            }
            Si += Pj;
            Pj=1;
            System.out.println(Si);
        }
        return "end";
    }
    public static String v3() {
        int j, i, k;
        double Pk = 1, Si = 0, Sj=0;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= i; j++) {
                for (k=1;k<=2*i;k++) {
                Pk *= ((2*j)+(3*i)-k);
                }
                Sj+=Pk;
                Pk=1;
            }
            Si+=Sj;
            Sj=0;
            System.out.println(Si);
        }
        return "end";
    }
}


