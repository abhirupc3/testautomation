package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/2/22
 * @project testautomation
 */

/**
 * This program will sum 2 numbers and return the result
 */
public class DigiSum {
    static int digit = 1234;

    public static void main(String[] args) {
        printSum(digit);
    }

    /**
     * This method will sum the digits of a number and print.
     * for example: if the number  is 123.
     * thie o/p will be 6.
     * algorithm:
     *
     * @param digit
     */
    private static void printSum(int digit) {
        System.out.print("The original number is: " + digit);
        int sum = 0;
        int rem = digit % 10;
        while (digit != 0) {
            rem = digit % 10;
            sum = sum + rem;
            digit = digit / 10;
        }
        System.out.print("The sum of each digit is: " + sum);
    }
}
