package practice;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(isEligible(age)){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }

    static boolean isEligible(int age){
        return age >= 18;
    }
}
