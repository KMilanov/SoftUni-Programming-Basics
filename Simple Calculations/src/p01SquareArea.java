import java.util.Scanner;

public class p01SquareArea {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

                System.out.println("a = ");
        int side = Integer.parseInt(scan.nextLine());
        int area = side * side;
                System.out.println("Square =" + area);

    }
}
