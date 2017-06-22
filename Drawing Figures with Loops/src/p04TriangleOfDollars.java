import java.util.Scanner;

public class p04TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int row = 0; row < n; row++) {
            System.out.print("$");
            for (int col = 0; col < row; col++) {
                System.out.print(" $");
            }
            System.out.println();
        }


    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
