
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n=sc.nextInt();
        System.out.println("Enter the second number:");
        int m=sc.nextInt();
        int temp=n;
        n=m;
        m=temp;
        System.out.println("After swapping the numbers are");
        System.out.println("First number is "+n);
        System.out.println("Second number is "+m);

    }
    
}
