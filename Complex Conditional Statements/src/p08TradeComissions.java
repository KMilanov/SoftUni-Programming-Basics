import java.util.Scanner;

public class p08TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine().toLowerCase();
        double sales = Double.parseDouble(scan.nextLine());

        boolean error = sales <= 0;
        boolean first = sales >= 00 && sales <= 500;
        boolean second = sales > 500 && sales <= 1000;
        boolean third = sales > 1000 && sales <= 10000;
        boolean fourth = sales > 10000;

        double bonus = 0;

        switch (town){
            case "sofia":
                if (error){
                    System.out.println("error");
                } else if (first){
                    bonus = sales * 0.05;
                    System.out.printf("%.2f", bonus);
                } else if (second){
                    bonus = sales * 0.07;
                    System.out.printf("%.2f", bonus);
                } else if (third) {
                    bonus = sales * 0.08;
                    System.out.printf("%.2f", bonus);
                } else if (fourth) {
                    bonus = sales *0.12;
                    System.out.printf("%.2f", bonus);
                }
            break;

            case "varna":
                if (error){
                    System.out.println("error");
                } else if (first){
                    bonus = sales * 0.045;
                    System.out.printf("%.2f", bonus);
                } else if (second){
                    bonus = sales * 0.075;
                    System.out.printf("%.2f", bonus);
                } else if (third) {
                    bonus = sales * 0.10;
                    System.out.printf("%.2f", bonus);
                } else if (fourth) {
                    bonus = sales *0.13;
                    System.out.printf("%.2f", bonus);
                }
            break;

            case "plovdiv":
                if (error){
                    System.out.println("error");
                } else if (first){
                    bonus = sales * 0.055;
                    System.out.printf("%.2f", bonus);
                } else if (second){
                    bonus = sales * 0.08;
                    System.out.printf("%.2f", bonus);
                } else if (third) {
                    bonus = sales * 0.12;
                    System.out.printf("%.2f", bonus);
                } else if (fourth) {
                    bonus = sales *0.145;
                    System.out.printf("%.2f", bonus);
                }
            break;

            default:
                System.out.println("error");
            break;
        }
    }
}
