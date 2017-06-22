import java.util.Scanner;

public class p04FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.equals("banana") || s.equals("apple") || s.equals("kiwi") || s.equals("cherry") || s.equals("lemon") || s.equals("grapes")) {
            System.out.println("fruit");
        } else if (s.equals("tomato") || s.equals("cucumber") || s.equals("pepper") || s.equals("carrot")){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
