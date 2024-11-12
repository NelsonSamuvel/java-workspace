package learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(c,Math.max(a,b));
//        if(a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }


        System.out.println(max);
    }
}