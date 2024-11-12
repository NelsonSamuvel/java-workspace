package learning;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        int count = 0;
        while (n > 0){
            long digit = n%10;
            if(digit == 7){
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}
//13857578791777
