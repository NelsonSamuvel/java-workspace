package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X1 : " );
        int x1 = sc.nextInt();
        System.out.print("Y1 : " );
        int y1 = sc.nextInt();
        System.out.print("X2 : " );
        int x2 = sc.nextInt();
        System.out.print("Y2 : " );
        int y2 = sc.nextInt();

        double distance = 0;

        if(x1==0 && y1==0 && x2 == 0 && y2 ==0){
            System.out.println("All Points are 0");
        }else{
            double horizontalDist = Math.pow((x2-x1),2);
            double verticalDist = Math.pow((y2-y1),2);
            distance = Math.sqrt(horizontalDist + verticalDist);
        }

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The distance between two points is : " + df.format(distance) + " units");

        sc.close();

    }
}
