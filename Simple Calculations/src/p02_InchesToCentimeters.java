import java.util.Scanner;

public class p02_InchesToCentimeters {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        int firstNumber = Integer.parseInt(scan.nextLine());
        double secondNumber = Double.parseDouble(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        double expression = (firstNumber + secondNumber) * (secondNumber/thirdNumber);
    }
}
