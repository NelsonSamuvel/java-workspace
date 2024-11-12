package practice;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0;
        int posEven = 0;
        int posOdd = 0;
        while (true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                neg += n;
            }
            if(n > 0){
                if(n %2==0){
                    posEven += n;
                }
                else{
                    posOdd += n;
                }
            }
        }

        System.out.println("Sum of negative numbers: " + neg);
        System.out.println("Sum of positive even numbers: " + posEven);
        System.out.println("Sum of positive odd numbers: " + posOdd);

    }
}

