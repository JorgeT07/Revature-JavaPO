import java.util.Locale;
import java.util.Scanner;

public class Driver {

    public static boolean response(String pin){
        String comparator = pin.replaceAll("[^\\d]", "");
        if(pin.length() ==6 || pin.length()==4) {
            if(pin.equals(comparator))
                return true;
        }
        return false;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pin = " "; //starting with a whitespace in the pin
        boolean run = true; //allows the while loop to run
        String rsp; //for user input if they want to try to put pins for themselves

        System.out.println("121317 -> " + response("121317")); // true
        System.out.println("1234 -> " + response("1234"));	// true
        System.out.println("45135 -> " + response("45135"));	// false
        System.out.println("89abc1 -> " + response("89abc1"));	// false
        System.out.println("900876 -> " + response("900876"));	// true
        System.out.println(" 4983 -> " + response(" 4983"));	// false
        System.out.println("To try some of your own? (y/n):");

        rsp = sc.nextLine();
        rsp = rsp.toLowerCase(Locale.ROOT);

        if(rsp.equals("y")) { //if the user types y they will enter the while loop
            while (run) { //will execute as long as the condition is true
                System.out.println("Enter your 4 or 6 digit PIN");
                pin = sc.nextLine();
                System.out.println(response(pin));
                System.out.println("If you'd like to exit the program press x");
                String select = sc.nextLine();
                if (select.equals("x") || select.equals("X")) {
                    run = false;
                }
            }
        }

        System.out.println("execution complete");


    }
}
