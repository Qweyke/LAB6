import java.util.*;
public class Tsk4Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to number system converter");
        for (; ; ) {
            System.out.println("Do you want to proceed? Type 'y' or 'n'");
            String yes = "y";
            String no = "n";
            String ans = scan.nextLine();
            if (ans.equals(yes)) {
                System.out.println("Pls enter decimal integer for transfer");
                int a = scan.nextInt();
                System.out.println("Pls enter number system, that is <=9 and isn't 0 or 1");
                int b = scan.nextInt();
                if (b <= 9 & b != 0 & b != 1) {
                            int i=0;
                            int[] ss = new int[100000];
                            while (a>0) {
                                ss[i]= a%b;
                                i++;
                                a/=b;
                            }
                            for (int j =i-1; j>=0;j--) {
                                System.out.print(ss[j]);
                            }
                            System.out.println();
                        }
                else {
                    System.out.println("Something went wrong, pls follow the instructions");
                }
            }
            else if (ans.equals(no)) {
                break;
            }
        }
    }
}



