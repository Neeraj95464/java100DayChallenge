import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number to know Armstrong ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int originalNum = num; // Store the original number
        int numOfDigit = 0;
        int lastResult = 0;

        while (num > 0) {
            num = num / 10;
            numOfDigit++;
        }

        num = originalNum; // Restore the original number for the calculation

        while (num > 0) {
            int rem = num % 10;
            lastResult += Math.pow(rem, numOfDigit);
            num = num / 10;
        }

        if (lastResult == originalNum) {
            System.out.println("Yes, it's an Armstrong number.");
        } else {
            System.out.println("No, it's not an Armstrong number.");
        }
    }
}
