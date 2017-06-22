import java.util.Scanner;

public class p10EmptySquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        if (size == 1){
            System.out.println("error");
        } else if(size == 2){
            System.out.println("error");
        } else {
            System.out.println(repeatStr("*", size));
            for (int i = 1; i < size-1; i++) {
                System.out.println("*" + repeatStr(" ", size-2) + "*");
            }
            System.out.println(repeatStr("*", size));
        }

    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}
