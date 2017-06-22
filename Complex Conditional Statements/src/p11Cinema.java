import java.util.Scanner;

public class p11Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine().toLowerCase();
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.next());

        switch (type) {
            case "premiere":
                System.out.printf("%.2f", ((a * b) * 12));
                break;
            case "normal":
                System.out.printf("%.2f", ((a * b) * 7.50));
                break;
            case "discount":
                System.out.printf("%.2f", ((a * b) * 5));
                break;
        }
    }
}
