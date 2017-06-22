import java.util.Scanner;

public class p09PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (input.equals(password)) {
            System.out.println("Welcome");
        } else if (!input.equals(password)) {
            System.out.println("Wrong password!");
        }

    }
}
