import java.util.Scanner;

public class p12Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1 ; 1 ; 2 ; 3 ; 5 ; 8 ; 13 ; 21 ; 34 ;
        int n = Integer.parseInt(scan.nextLine());
        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i < n-1; i++) {
            int fNext = f0 + f1;
            f0 = f1;
            f1 = fNext;
        }
        System.out.println(f1);
    }
}
