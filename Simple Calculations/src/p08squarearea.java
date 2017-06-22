import java.util.Scanner;

/**
 * Created by Kristiyan on 29-Apr-17.
 */
public class p08squarearea {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double sideA = Math.abs(x2 - x1);
        double sideB = Math.abs(y2 - y1);

        double perimeter = (sideA+ sideB) * 2;
        double area = sideA * sideB;

        System.out.println(area);
        System.out.println(perimeter);


    }
}
