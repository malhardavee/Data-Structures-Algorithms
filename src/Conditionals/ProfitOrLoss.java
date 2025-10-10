package Conditionals;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        float CP = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        float SP = sc.nextInt();

        if (CP > SP){
            float Loss = CP - SP;
            System.out.println("Loss incurred: "+Loss);
        }
        else if (SP > CP){
            float Profit = SP - CP;
            System.out.println("Profit earned: "+Profit);
        }
        else{
            System.out.println("Neither Profit Earned Nor Loss Incurred");
        }
    }
}
