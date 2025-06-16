package Day2_ControlFlows;
import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number is positive:"+n);
        }else if(n<0){
            System.out.println("Number is negative:"+n);
        }else{
            System.out.println("number is zero");
        }
    }
}
