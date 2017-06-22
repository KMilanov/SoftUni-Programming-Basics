import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;
public class p09House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalHeight = Integer.parseInt(scan.nextLine());
        int baseHeight = totalHeight / 2;
        int roofHeight = totalHeight - baseHeight;
        int topStars = 0;

        if (totalHeight %2 == 0){
            topStars = 2;
        } else if (totalHeight %2 == 1){
            topStars = 1;}
// roof
        for (int i = 1; i <= roofHeight; i++) {
            System.out.printf("%s%s%s%n",
                    repeatStr("-", (totalHeight - topStars)/2),
                    repeatStr("*", topStars),
                    repeatStr("-", (totalHeight - topStars)/2));
            topStars += 2;
        }
// bottom
        for (int i = 0; i < baseHeight; i++) {
            System.out.println("|" + repeatStr("*", totalHeight-2) + "|");
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


