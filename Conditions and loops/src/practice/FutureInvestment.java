package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial amount : ");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest (in percentage): ");
        int r = sc.nextInt();
        if(r < 0 || r>100){
            System.out.println("invalid rate of interest");
            return;
        }
            System.out.print("Enter the time periods : ");
            int n = sc.nextInt();
            if(n <= 0){
                System.out.println("The time periods should not be less than 0");
                return;
            }
            System.out.print("Enter the total time (in years) : ");
            int t = sc.nextInt();

            double rate = (double)r/100;
            System.out.println(rate);
            double FIV = p * Math.pow((1 + (rate/n)),(n*t));
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.print("The future investment value is : " + df.format(FIV));


        sc.close();
    }
}
