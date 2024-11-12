package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial amount : ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time (in years) : ");
        double time = sc.nextDouble();

        double si = principal * (double)rate/100 * time;

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The simple interest is : " + df.format(si));
        System.out.println("The total amount : " + (int)(principal + si));
        sc.close();
    }
}
