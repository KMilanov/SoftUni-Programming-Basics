import java.util.Scanner;

public class p12CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

        if (input.equals("USD")) {
            num = num * 1.79549;
        } else if (input.equals("EUR")) {
            num = num * 1.95583;
        } else if (input.equals("GBP")) {
            num = num * 2.53405;
        } else if (input.equals("BGN")) {
            num = num * 1;
        }

        if (output.equals("USD")) {
            num = num / 1.79549;
        } else if (output.equals("EUR")) {
            num = num / 1.95583;
        } else if (output.equals("GBP")) {
            num = num / 2.53405;
        } else if (output.equals("BGN")) {
            num = num / 1;
        }
        System.out.printf("%.2f",num, output);

    }

}
