package practice;

import java.util.Scanner;

public class ElecBills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Power Consumed in a month : ");
        int power = sc.nextInt();
        int totalCost = 0;
        double rate1 = 0.10;
        double rate2 = 0.15;
        double rate3 = 0.20;
        int fixedCharges = 20;
        int firstCheck = 200;
        int secondCheck = 200;
        int finalCheck = 400;

        if(power <= firstCheck) {
            totalCost += (int) (rate1 * power);
        }
        else if(power <= firstCheck + secondCheck){
            totalCost += (int)(rate1*firstCheck) + (int)(rate2 * power - firstCheck);
        }
        else {
            totalCost += (int)((rate1*firstCheck) + (rate2 * secondCheck) + (rate3* (power - finalCheck)));
        }

        System.out.println(totalCost);
    }
}
