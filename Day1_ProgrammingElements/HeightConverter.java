import java.util.*;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height in cm:");
        double HeightInCm=sc.nextDouble();
        double HeightInInches=HeightInCm/2.54;
        double HeightInFeet=HeightInInches/12;
        System.out.println("Height in feet is:"+HeightInFeet+" ft  and Height in inches is:"+HeightInInches+" in");
    }
    
}
