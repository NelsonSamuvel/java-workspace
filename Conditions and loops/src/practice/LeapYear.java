package practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if(year < 1000){
            System.out.println("Please enter a valid year");
            return;
        }

        //first we can include a condition for finding if the year divisible by 400
        // it  is leap year because it satisfies the condition of 400 which is 4 * 100
        // then add a another condition for checking divisible by 4 and !100

        if(year % 400 == 0 || (year %100 != 0 && year % 4 == 0)){
            System.out.println(year + " is leap year");
        }
        else{
            System.out.println(year + " not a leap year");
        }

//        if(year % 4 == 0){
//            if(year % 100 != 0){
//                System.out.println(year +" is a leap year");
//            }
//            else{
//                if(year % 400 == 0){
//                    System.out.println(year + " is a leap year");
//                }
//                else{
//                    System.out.println(year + " not a leap year");
//                }
//            }
//        }
//        else {
//
//        System.out.println(year + " not a leap year");
//        }

    }
}
