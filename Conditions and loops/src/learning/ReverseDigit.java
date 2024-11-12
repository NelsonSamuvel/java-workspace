package learning;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int count =0;
//        int temp = n;
//        while (temp > 0){
//            count++;
//            temp = temp/10;
//        }
//        count = count-1;
//        int res = 0;
//        temp = n;
//        while (temp > 0){
//            int rem = temp%10;
//            res +=  (int)(rem * Math.pow(10,count));
//            count--;
//            temp = temp/10;
//        }

        int res = 0;
        int temp = n;
        while (temp > 0){
            int rem = temp%10;
            res  = res*10 + rem;
            temp = temp/10;
        }


        System.out.print("The reversed number of " +n + " = " + res );
    }
}
