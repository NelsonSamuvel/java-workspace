package practice;

import java.util.Scanner;


//perfect  numbers are the number when the sum of divisors of number except the number is equal to the original number
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please enter a positive integer");
            return;
        }


        int sum = 0;

        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum += i;
            }
        }

        System.out.println(sum);

        if(n == sum){
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is not a perfect number");
        }

    }
}
