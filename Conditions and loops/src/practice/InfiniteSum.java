package practice;

import java.util.Scanner;

public class InfiniteSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            int n = sc.nextInt();
            if(n == 0 ){
                break;
            }
            sum += n;
            System.out.println("CUrrent Sum: " +  sum + " ");
        }
        System.out.print("Final Sum answer : " + sum);
    }
}