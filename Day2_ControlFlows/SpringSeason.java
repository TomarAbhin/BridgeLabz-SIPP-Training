package Day2_ControlFlows;
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        System.out.println("System.out.println:");
        int day = sc.nextInt();
        boolean isSpring = 
            (month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30)  || 
            (month == 5 && day >= 1 && day <= 31)  || 
            (month == 6 && day >= 1 && day <= 20);    

        
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
