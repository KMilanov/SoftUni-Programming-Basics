import java.util.Scanner;

public class p10RadiansToDegrees {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double  radians = Double.parseDouble(scan.nextLine());
        double degrees = radians*180/Math.PI;

        System.out.printf("%.2f", degrees);
    }
}
