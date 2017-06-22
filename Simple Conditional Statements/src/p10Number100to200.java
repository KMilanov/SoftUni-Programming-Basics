import java.util.Scanner;

public class p10Number100to200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());

        if (input < 100) {
            System.out.println("Less than 100");
        } else if (input >= 100 && input <= 200) {
            System.out.println("Between 100 and 200");
        } else if (input > 200) {
            System.out.println("Greater than 200");
        }
    }
}
