package practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int temp = n;
        int numDigits = 0;
        while (temp > 0){
            numDigits++;
            temp = temp / 10;
        }
        temp = n;
        int sum = 0;
        while (temp > 0){
            int rem = temp %10;
            sum += (int)Math.pow(rem,numDigits);
            temp = temp/10;
        }

        if(sum == n){
            System.out.println(n + " is an armstrong number");
        }
        else{
            System.out.println(n + " is not an armstrong number");
        }
        sc.close();
    }
}
