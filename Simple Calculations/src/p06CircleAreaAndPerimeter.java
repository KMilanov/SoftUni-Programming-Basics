import java.util.Scanner;

public class p06CircleAreaAndPerimeter {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double radius = Double.parseDouble(scan.nextLine());
        double perimeter = Math.PI * 2 * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Area =" +area);
        System.out.println("Perimeter =" +perimeter);

    }
}
