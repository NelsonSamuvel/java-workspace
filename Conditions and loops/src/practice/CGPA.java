package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        int sem = 5;
        double[] marks = {8,7,9,8.5,7.5};

        double totalMarks = 0;

        for (double mark : marks) {
            totalMarks += mark;
        }

        double CGPA = totalMarks/sem;

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("The CGPA is : " + df.format(CGPA));
    }
}
