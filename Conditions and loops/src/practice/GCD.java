package practice;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b  : ");
        int b = sc.nextInt();

        while (b != 0){
            int r = a%b;
            a= b;
            b=r;
        }

        System.out.println("GCD : " + a);
    }
}