import java.util.Scanner;

public class p06MinNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int max = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < max) {
                max = number;
            }
        }


        System.out.println(max);


    }
}
