import java.util.Scanner;

public class p08OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        long evenSum = 0;
        long oddSum = 0;
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes Sum =" + oddSum);
        } else {
            System.out.println("No Diff =" + (Math.abs(oddSum = evenSum)));
        }
    }
}
