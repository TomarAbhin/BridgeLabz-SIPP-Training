package Day2_ControlFlows;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = sc.nextInt();
        while(number != 0 ){
            int origNumber = number;
            int sum = 0;
            int count = 0;
            while (origNumber != 0) {
                origNumber /= 10;
                count++;
            }
            origNumber = number;
            while (origNumber != 0) {
                int digit = origNumber % 10;
                sum += Math.pow(digit, count);
                origNumber /= 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
}