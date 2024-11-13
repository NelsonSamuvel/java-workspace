package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else{

        int res = factorial(n);
        System.out.println("Factorial of " + n + " is: " + res);
        }
        sc.close();
    }

    static int factorial(int n){
        int fact = 1;
        while (n > 1){
            fact*= n;
            n--;
        }

        return fact;
    }
}
