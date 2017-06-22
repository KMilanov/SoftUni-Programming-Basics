import java.util.Scanner;

public class p05MaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > max) {
                max = number;
            }
        }


        System.out.println(max);


    }
}
