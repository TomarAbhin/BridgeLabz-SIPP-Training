import java.util.*;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price of item:");
        int cp=sc.nextInt();
        System.out.println("Enter the selling price of item:");
        int sp=sc.nextInt();
        int profit=sp-cp;
        int loss =cp-sp;
        if(profit>0){
           double ProfitPercent=(double)profit/(double)cp *100;
           System.out.println("the profit is :"+profit+" and the profit percent is:"+ProfitPercent);
        }else{
            double LossPercent=(double)loss/(double)cp*100;
            System.out.println("the loss is:"+loss+" and the LossPercent is:"+LossPercent);
        }
    }
    
}
