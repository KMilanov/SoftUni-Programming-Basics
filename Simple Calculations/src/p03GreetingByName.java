import java.util.Scanner;

public class p03GreetingByName {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        System.out.println("Hello, " + name +"!");
    }
}

