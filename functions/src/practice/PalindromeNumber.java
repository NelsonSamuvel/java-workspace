package practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
            if(isPalindrome(n)){
                System.out.println(n + " is a palindrome");
            }
            else{
                System.out.println(n + " is not a palindrome");
            }
        sc.close();
    }

    static boolean isPalindrome(int n){

        if(n < 0){
            return false;
        }

        if(n < 10){
            return true;
        }

        int temp = n;
        int reversed = 0;
        while (temp > 0){
            int rem = temp % 10;
            reversed = (reversed * 10) + rem;
            temp = temp /10;
        }

        return n==reversed;

    }
}
