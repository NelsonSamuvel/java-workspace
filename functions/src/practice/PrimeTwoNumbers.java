package practice;

import java.util.Scanner;

public class PrimeTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println("n1 should be less than n2");
        }
        else{
            System.out.print("The prime numbers between " + n1 +" and " + n2 + " are: ");
            for(int i=n1;i<=n2;i++){
                if(isPrime(i)){
                    System.out.print(i +" ");
                }
            }
        }

        sc.close();
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
