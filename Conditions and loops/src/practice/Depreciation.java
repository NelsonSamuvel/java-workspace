package practice;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Original Price : ");
        int price = sc.nextInt();
        System.out.print("The Salvage Price : ");
        int salvage = sc.nextInt();
        if(salvage >= price){
            System.out.println("Salvage must be less than price");
        }
        else{
        System.out.print("The useful life : ");
        int assetLife = sc.nextInt();
        double depreciated = (double)(price - salvage)/assetLife;
        System.out.println("Depreciated price per year is : "+ depreciated);
        }
        sc.close();
    }
}
