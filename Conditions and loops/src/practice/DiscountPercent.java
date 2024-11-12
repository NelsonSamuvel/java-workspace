package practice;

import java.util.Scanner;

public class DiscountPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalPrice = sc.nextInt();
        double discountPrice = sc.nextInt();
        if(originalPrice <= 0 || discountPrice <=0){
            System.out.println("Invalid Price");
        }
        else if(discountPrice > originalPrice){
            System.out.println("Your discount price is greater than Original price");
        }
        else{
            double decimal =  discountPrice / originalPrice;
            int percentage = (int)(decimal * 100);
            System.out.println("The percentage is : " + percentage);
        }

        sc.close();
    }
}
