package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        if(a < 0 || b< 0){
            System.out.println("invalid inputs");
            return;
        }

        if(a == 0 || b==0){
            System.out.println("LCM :" + 0);
            return;
        }


        int gcd = GCD(a,b);

        int lcm = (a * b)/gcd;
        System.out.println("LCM : " + lcm);
        sc.close();
    }

    static int GCD(int a, int b){
        while (b != 0){
            int r = a %b;
            a = b;
            b= r;
        }

        return a;
    }
}
