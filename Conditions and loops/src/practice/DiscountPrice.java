package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalPrice = sc.nextInt();
        int discountPercent = sc.nextInt();
        if(originalPrice <= 0 || discountPercent <=0 || discountPercent > 100){
            System.out.println("Invalid inputs");
        }
        else{
            double discountAmount = (double)discountPercent/100;
            double discountPrice =  (discountAmount * originalPrice);

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.printf("The discount Price is: " +  df.format(discountPrice));
        }
    }
}
