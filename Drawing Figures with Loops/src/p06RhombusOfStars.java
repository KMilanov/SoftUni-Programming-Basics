import java.util.Scanner;

/**
 * Created by Kristiyan on 03-Jun-17.
 */
public class p06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int spaceCount = n-1;


        for (int row = 1; row <= n; row++) {
            System.out.println(repeatStr(" ", spaceCount) + repeatStr("* ", row));
            spaceCount--;
        }

        for (int row = n - 1; row >=1 ; row--) {
            System.out.println(repeatStr(" ", ++spaceCount) + repeatStr(" *", row));
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
