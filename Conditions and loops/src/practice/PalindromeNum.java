package practice;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        if(n < 0){
            System.out.println("Negative numbers are not palindrome");
        }
        else if(n <= 9){
            System.out.println("Palindrome");
        }
        else{
            int temp = n;

            while (temp > 0){
                int rem = temp % 10;
                sum =(sum * 10) + rem;
                temp = temp/10;
            }

            if(n == sum){
                System.out.println(n + " is a palindrome");
            }
            else{
                System.out.println(n + " is not a palindrome");
            }
        }
        sc.close();
    }
}
