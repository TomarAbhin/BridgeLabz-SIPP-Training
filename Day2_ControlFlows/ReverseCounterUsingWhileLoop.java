package Day2_ControlFlows;
import java.util.*;
public class ReverseCounterUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vaid number:");
        int n=sc.nextInt();
        System.out.println("the counting from "+n+" to 1 is:");
        while(n!=0){
            System.out.println(n);
            n--;
        }
    }
}
