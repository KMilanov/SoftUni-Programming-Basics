import java.util.Scanner;

public class p04GreaterNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        }else {
            System.out.println("Greater number is: " +num2);
        }
    }
}
