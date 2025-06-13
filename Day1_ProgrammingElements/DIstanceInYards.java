import java.util.*;
public class DIstanceInYards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in feet:");
        double distance=sc.nextDouble();
        double yards=distance/3;
        double miles=yards/1760;
        System.out.println("Distance in miles is:"+miles+" and in yards in:"+yards);
    }
}
