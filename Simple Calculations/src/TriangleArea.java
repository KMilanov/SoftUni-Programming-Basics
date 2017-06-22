import java.util.Scanner;

/**
 * Created by Kristiyan on 02-May-17.
 */
public class TriangleArea {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double side = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double area = (side * height) /2;

        System.out.printf("%.2f", area);





    }
}
