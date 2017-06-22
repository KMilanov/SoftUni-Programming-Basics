import java.util.Scanner;

public class p07LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int a = count / 2;

        for (int i = 0; i < a; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum1 += number;
        }

        for (int i = 0; i < a; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum2 += number;
        }

        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            System.out.println("No, diff =  " + (Math.abs(sum1 - sum2)));
        }

    }
}
