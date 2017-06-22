import java.util.Scanner;

public class p05SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("+" + repeatStr(" -", n - 2) + " +");

        for (int row = 0; row < n - 2; row++) {
            System.out.printf("|%s |%n", repeatStr(" -", n - 2));
        }

        System.out.println("+" + repeatStr(" -", n - 2) + " +");

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
