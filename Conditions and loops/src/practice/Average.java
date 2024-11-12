package practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while(true){
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            total += num;
            count++;
        }

        if(count == 0){
            System.out.println("No numbers were inserted");
        }
        else{
            double res = (double) total /count;
            System.out.println(res);
            sc.close();
        }
    }
}
