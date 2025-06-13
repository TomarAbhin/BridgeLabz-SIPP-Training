import java.util.*;
public class UniversityDiscountAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fees:");
        double fees=sc.nextInt();
        System.out.println("Enter the dicount percent:");
        double discount=sc.nextInt();
        double discountedAmount=(fees*discount)/100;
        double finalAmount=fees-discountedAmount;
        System.out.println("the discounted amount is:"+discountedAmount+" and the final amount is:"+finalAmount);

    }
    
}
