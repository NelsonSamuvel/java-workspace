package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an initial amount : ");
        int principal = sc.nextInt();
        System.out.print("Enter rate of interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the compounding time : ");
        int compound = sc.nextInt();
        System.out.print("Enter the time (in years) : ");
        double time = sc.nextDouble();

        double r = rate/100;

        double totalPeriods = compound * time;

        double totalPrincipal = principal * Math.pow((1 + r/compound),totalPeriods);
        DecimalFormat df = new DecimalFormat("#.##");

        double CI = totalPrincipal - principal;

        System.out.print("The compound interest is : " + df.format(CI));

        sc.close();

    }

}
