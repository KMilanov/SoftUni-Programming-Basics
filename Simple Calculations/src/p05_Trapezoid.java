import java.util.Scanner;

public class p05_Trapezoid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double fistBase = Double.parseDouble(scan.nextLine());
        double secondBase = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double area = (fistBase + secondBase ) * height /2;

                System.out.println("Trapezoid area=" +area);
    }
}
