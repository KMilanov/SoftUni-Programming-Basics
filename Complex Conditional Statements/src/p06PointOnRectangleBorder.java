import java.util.Scanner;

public class p06PointOnRectangleBorder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

     //   boolean onBoarder = (x == x1 || x == x2) && (y >= y1) && (y <= y2) || (y == y1 || y == y2) && (x >= x2 && x <= x2);
        boolean onBoard = (((x == x1 || x == x2) && (y >= y1) && (y <= y2)) || ((y == y1 || y == y2) &&(x >= x1) && (x <= x2)));

        if (onBoard) {
            System.out.print("Border");
        } else{
            System.out.print("Inside / Outside");
        }
             // check presentation
    }

}

