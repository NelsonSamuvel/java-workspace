package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CommisionPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount : ");
        int sales = sc.nextInt();
        System.out.print("Enter the Commission rate : ");
        int commissionRate = sc.nextInt();
        if(sales == 0){
            System.out.println("No products sale");
        }
        else if(commissionRate <0 || commissionRate >100){
            System.out.println("Invalid Percentage");

        }
        else{
            double amount = sales * (double)commissionRate/100;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("The total commission is : " + df.format(amount));
            System.out.println("The commision percentage : " + commissionRate + "%");
        }
        sc.close();
    }
}
