package practice;

import java.util.Scanner;

public class SumNaturals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("Natural numbers starts from 1");
        }
        else{
            long res = sumNaturals(n);
            System.out.println("Sum of first " + n +" natural number is: " + res);
        }

        sc.close();
    }

    static long sumNaturals(int n){
        return ((long) n * (n+1))/2;
    }

//    static int sumNaturals(int n){
//        int sum = 0;
//        for (int i=1;i<=n;i++){
//            sum += i;
//        }
//        return sum;
//    }


}
