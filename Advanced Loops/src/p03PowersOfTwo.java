import java.util.Scanner;

public class p03PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 0;

        for (int i = 0; i <= n; i++) {
            System.out.println((int)Math.pow(2, i));
        }
    }
}
