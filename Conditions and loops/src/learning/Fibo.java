package learning;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        if(n == 1 ){
            System.out.println(first);
        } else if (n==2) {
            System.out.println(second);
        } else{
        int times = 2;
        while (times < n){
            int temp = second;
           second = second+first;
           first = temp;
           times++;
        }

        System.out.println(second);
        }
    }
}
