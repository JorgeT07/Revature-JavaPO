import java.util.Scanner;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

public class Driver {
    public static boolean response(String pin){
        boolean resp = false;
        String comparator = pin.replaceAll("[^\\d]", "");
        if(pin.length() ==6 || pin.length()==4) {
            if(pin.equals(comparator))
                resp = true;
        }
        return resp;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pin = " ";
        boolean run = true;

        while(run){
            System.out.println("Enter your 4 or 6 digit PIN");
            pin = sc.nextLine();
//            pin = pin.replaceAll("[^\\d]", "");
            System.out.println(response(pin));
            System.out.println("If you'd like to exit the program press x");
            String select = sc.nextLine();
            if(select.equals("x") || select.equals("X")){
                run = false;
            }
        }

        System.out.println("executed successfully");


    }
}
