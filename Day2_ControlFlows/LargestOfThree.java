package Day2_ControlFlows;
import java.util.*;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first Number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third Number:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Is the first number largest: true");
        }
        else if(b>a && b>c){
            System.out.println("Is the second number largest: true");
        }
        else if(c>a && c>b){
            System.out.println("Is the third number largest: true");
        }
    }
}
