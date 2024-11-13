package practice;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter the mark of subject" + i+1 + ": ");
            int mark = sc.nextInt();
            String grade = getGrade(mark);
            if(!grade.isEmpty()){
                if(grade.equals("FAIL")){
                    System.out.print("You failed in the sem");
                    break;
                }
                System.out.println("Grade of subject" + i+1 +": " + grade);
            }
        }
    }

    static String getGrade(int mark){
        if(mark <= 40){
            return "FAIL";
        } else if (mark<=50) {
            return "DD";
        } else if (mark <= 60) {
            return "CD";
        } else if (mark <= 70) {
            return "BC";
        } else if (mark <= 80) {
            return  "BB";
        } else if (mark <= 90) {
            return "AB";
        } else if (mark<=100){
            return "AA";
        }
        else{
            return "";
        }
    }
}
