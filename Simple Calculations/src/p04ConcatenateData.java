import java.util.Scanner;

public class p04ConcatenateData {
    public static void main( String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String fisrtName = scan.nextLine();
        System.out.println("Enter yout last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the town where you live:");
        String town = scan.nextLine();

        String result = String.format("You are %s %s, a %d-years old person from %s.", fisrtName, lastName, age, town);

        System.out.println(result);


    }
}
