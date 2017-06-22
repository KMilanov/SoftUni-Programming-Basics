import java.util.Scanner;

public class p11UsdToBgn {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Double USD = Double.parseDouble(scan.nextLine());

        Double BGN = USD * 1.79549;

        System.out.printf("%.2f" , BGN);

    }
}
