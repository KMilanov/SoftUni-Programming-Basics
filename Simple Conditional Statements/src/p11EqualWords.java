import java.util.Scanner;

public class p11EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();

        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.equals(second)) {
            System.out.print("yes");
        } else if (!first.equals(second)) {
            System.out.print("no");
        }
    }
}
