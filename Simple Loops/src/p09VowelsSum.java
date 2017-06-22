import java.util.Scanner;
public class p09VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        long sum = 0;
        int number = 0;

        for( int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);

            switch (letter){
                case 'a': number = 1; break;
                case 'e': number = 2; break;
                case 'i': number = 3; break;
                case 'o': number = 4; break;
                case 'u': number = 5; break;
                default: number = 0; break;
            }
                sum += number;
        }
            System.out.println(sum);
    }
}
