package practice;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }

    static boolean isPrime(int val){
        if(val <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(val);i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }

}
