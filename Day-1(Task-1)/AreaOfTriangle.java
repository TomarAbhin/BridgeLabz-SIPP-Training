import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Height of triangle in cm:");
        double height=sc.nextDouble();
        System.out.println("Base of triangle in cm:");
        double base=sc.nextDouble();
        double area=0.5*height*base;
        double AreaInInch=area/2.54;
        System.out.println("Area of triangle in cm is:"+area+"cm^2  and area in inches is:"+AreaInInch+"in^2");
    }
}
