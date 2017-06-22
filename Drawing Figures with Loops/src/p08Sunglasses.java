import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class p08Sunglasses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.println(repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2));

        for (int i = 1; i <= n - 2; i++) {
            if (n % 2 > 0) {
                if (i == n/2) {
                    System.out.println("*" + repeatStr("/", n * 2 - 2) + "*" + repeatStr("|", n) + "*" + repeatStr("/", n * 2 - 2) + "*");
                } else {
                    System.out.println("*" + repeatStr("/", n * 2 - 2) + "*" + repeatStr(" ", n) + "*" + repeatStr("/", n * 2 - 2) + "*");
                }
            } else {
                if (i == ((n-2)/2)) {
                    System.out.println("*" + repeatStr("/", n * 2 - 2) + "*" + repeatStr("|", n) + "*" + repeatStr("/", n * 2 - 2) + "*");
                } else {
                    System.out.println("*" + repeatStr("/", n * 2 - 2) + "*" + repeatStr(" ", n) + "*" + repeatStr("/", n * 2 - 2) + "*");
                }

            }
        }

        System.out.println(repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2));

    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}


