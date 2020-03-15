import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(divideLBYL(5,0));
        System.out.println(divideEAFP(5, 0));
        System.out.println(getIntLBYL());
        System.out.println(getIntEAFP());
    }

    /**
     * Look before you leave
     */
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    /**
     *  Easy Ask Forgiveness and Permissions
     */
    private static int divideEAFP(int x, int y) {
        try {
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }


    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter a number:");
        String input = s.next();
        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            return Integer.parseInt(input);
        }

        return 0;
    }

    public static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}
