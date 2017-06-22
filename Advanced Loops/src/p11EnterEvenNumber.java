import java.util.Scanner;

public class p11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.println("Enter even number: ");
                n = Integer.parseInt(scan.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    break;
                }
                System.out.println("The number is not even. ");
            } catch (Exception ex) {
                System.out.println("Invalid number. ");
            }
        }
    }
}
