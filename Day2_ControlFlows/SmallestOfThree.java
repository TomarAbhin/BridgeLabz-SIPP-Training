package Day2_ControlFlows;
import java.util.*;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int a=sc.nextInt();
        System.out.println("Enter The Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter The Third Number:");
        int c=sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("Is First Number the smallest: True");
        }
        else{
            System.out.println("Is first number the smallest:False");
        }
    }
}
