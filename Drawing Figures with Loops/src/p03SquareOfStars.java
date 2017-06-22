import java.util.Scanner;

/**
 * Created by Kristiyan on 03-Jun-17.
 */
public class p03SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("* ", n));
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
