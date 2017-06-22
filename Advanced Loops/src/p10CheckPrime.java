import java.util.Scanner;

public class p10CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        boolean isPrime = true;
        int divider = 2;

        if (n < 2) {
            isPrime = false;
        } else {
            while (true) {
                if (n % divider == 0) {
                    isPrime = false;
                    break;
                }
                divider++;
                if (divider == n) {
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
