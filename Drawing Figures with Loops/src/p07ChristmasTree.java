import java.util.Scanner;

public class p07ChristmasTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        int n = Integer.parseInt(scan.nextLine());

        System.out.println(repeatStr(" ", n+1) + "|");

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr(" ", n-i) + repeatStr("*", i) + " " + "|" + " " + repeatStr("*", i));
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

