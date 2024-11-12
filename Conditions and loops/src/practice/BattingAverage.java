package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Total runs : ");
        int totalRuns = sc.nextInt();
        System.out.print("The Total Outs : ");
        int totalOuts = sc.nextInt();
        double averageBatting = 0;
        if(totalOuts == 0){
            averageBatting = totalRuns;
        }
        else{
             averageBatting = (double)totalRuns/totalOuts;
        }
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("The average Batting is : " + df.format(averageBatting)+" runs" );
        sc.close();
    }
}
