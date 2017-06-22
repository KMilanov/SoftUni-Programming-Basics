import java.util.Scanner;

public class p06BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        int number = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0.0;

        if (number <= 100) {
            bonusPoints = 5;
        }
        else if (number > 1000){
            bonusPoints = number * 0.1;
        }
        else if (number > 100){
            bonusPoints = number * 0.2;
        }

        if (number %2 == 0){
            bonusPoints = bonusPoints +1;
        }
        if (number %5 == 0){
            if (number %2 > 0){
                bonusPoints = bonusPoints + 2;
            }
        }
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + number);

    }
}
