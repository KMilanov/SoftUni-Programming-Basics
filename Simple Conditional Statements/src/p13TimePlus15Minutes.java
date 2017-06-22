import java.util.Scanner;

public class p13TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());
        int newhour = hour + 1;
        int newmin = min + 15;

        if (newmin <= 59) {
            System.out.println(hour + ":" + newmin);
        } else if (newmin >= 60 && (newmin - 60) <= 9 && hour <= 22) {
            System.out.println(newhour + ":0" + (newmin - 60));
        } else if (newmin >= 60 && (newmin - 60) >= 10 && hour <= 22) {
            System.out.println(newhour + ":" + (newmin - 60));
        } else if (newmin >= 60 && (newmin - 60) <= 9 && hour >= 23) {
            System.out.println("0:0" + (newmin - 60));
        } else if (newmin >= 60 && (newmin - 60) >= 10 && hour >= 23) {
            System.out.println("0:" + (newmin - 60));
        }
    }
}
