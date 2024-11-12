package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = {72.5,87.5,86.2,97.5,88};
        int n = marks.length;
        double sumMarks =0;
        for(double mark : marks){
            sumMarks += mark;
        }
        double avg = sumMarks / n;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("The average mark is : " + df.format(avg));
        sc.close();
    }
}
