import java.util.Scanner;

public class p07SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int total = first + second + third;
        int minutes = total / 60;
        int seconds = total % 60;

        if (seconds < 10){
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }

    }
}
