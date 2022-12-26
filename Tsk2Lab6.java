import java.util.*;
public class Tsk2Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A,B,S=0,D;
        int N;
        System.out.println("Pls,enter your bursary");
        A = scan.nextDouble();
        System.out.println("Pls,enter your annual expenses(That number must be bigger than bursary)");
        B = scan.nextDouble();
        System.out.println("Pls,enter the quantity of months");
        N = scan.nextInt();
        double Sa = A;
        int i;
        for (i=1;i<=N;i++) {
            if (i==1) {}
            else if ( i%2 ==0 ) {
                double per5 = (B*5)/100;
                B = B+per5;
                Sa=Sa+A;
            }
            else {
                double per3 = (B * 3) / 100;
                B = B + per3;
                Sa=Sa+A;
            }
            S = S+B;
        }
        D = S-Sa;
        System.out.printf("Full sum for " +N+ " months is %.3f \n", S);
        System.out.printf("Additional money needed = %.3f \n", D);
    }
}
