import java.util.Scanner;

public class p08Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int factorial = 1;

        do {
            factorial = factorial * n;
            n--;
        } while (n > 1);
            System.out.println(factorial);
    }
}
