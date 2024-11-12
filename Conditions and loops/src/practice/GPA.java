package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark#1");
        double[] marks = {7,7,7,8,9};
        int[] credits = {3,3,3,4,4};
        double sumGrade = 0;
        int sumCredits = 0;
        for(int i=0;i<marks.length;i++){
            sumGrade += marks[i] * credits[i];
            sumCredits += credits[i];
        }
        double GPA = sumGrade/sumCredits;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("The GPA is  : " + df.format(GPA));

        sc.close();



    }
}
