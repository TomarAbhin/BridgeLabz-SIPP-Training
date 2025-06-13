
import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perimeter of square:");
        int perimeter=sc.nextInt();
        int side=perimeter/4;
        System.out.println("The length of side of square is:"+side+" whose perimeter is:"+perimeter);

    }
}
