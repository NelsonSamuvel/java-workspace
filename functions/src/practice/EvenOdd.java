package practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println(n+" is an even number");
        }
        else{
            System.out.println(n + " is an odd number");
        }
    }

    static boolean isEven(int n){
        return n%2 ==0;
    }
}
