import java.util.Scanner;

public class p08MetricConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String inType = scan.nextLine();
        String outType = scan.nextLine();
        double result = 0;
        double milimeters = 1000;
        double centimeters = 100;
        double miles = 0.000621371192;
        double inches = 39.3700787;
        double kilometers = 0.001;
        double feet = 3.2808399;
        double yards = 1.0936133;

        if (inType.equals("mm")){
            number = number / milimeters;
        }else if (inType.equals("cm")){
            number = number / centimeters;
        }else if (inType.equals("mi")){
            number = number / miles;
        }else if (inType.equals("in")){
            number = number / inches;
        }else if (inType.equals("km")){
            number = number / kilometers;
        }else if (inType.equals("ft")){
            number = number / feet;
        }else if (inType.equals("yd")){
            number = number / yards;
        }

        if (outType.equals("mm")){
            number = number * milimeters;
        } else if  (outType.equals("cm")){
            number = number * centimeters;
        }else if  (outType.equals("mi")){
            number = number * miles;
        }else if  (outType.equals("in")){
            number = number * inches;
        }else if  (outType.equals("km")){
            number = number * kilometers;
        }else if  (outType.equals("ft")){
            number = number * feet;
        }else if  (outType.equals("yd")){
            number = number * yards;
        }

        System.out.printf("%f  %s", number, outType);

    }

}
