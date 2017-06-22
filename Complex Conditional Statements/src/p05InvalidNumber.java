import java.util.Scanner;

public class p05InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        boolean isValid = (number == 00) || (number >= 100 && number <= 200);

        if (!isValid){
            System.out.println("invalid");
        }
    }
}
