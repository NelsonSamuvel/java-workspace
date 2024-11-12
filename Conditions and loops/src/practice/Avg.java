package practice;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += i;
        }
        System.out.println("The average of number " + n + " is " + sum/n);
    }
}
