package practice;

import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of items : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of items to select : ");
        int r = sc.nextInt();
        if(r > n){
            System.out.println("the items that u want to select must be less than total items");
        } else if (r == 0) {
            System.out.print("No.of ways : " + 1);
        } else{
            // ncr formula ncr = n!/(n-r)! will give total no. of ways to select an item but it will not take
            // unique items in combinations order doesn't matter so n!/r!(n-r)!

            int factN = 1;
            for(int i=n;i>(n-r);i--){
                factN *= i;
            }
            int factR = 1;
            for(int i=r;i>1;i--){
                factR *= i;
            }
//            int remItems = n-r;
//            int factRem = 1;
//            for(int i=remItems;i>1;i--){
//                factRem *= i;
//            }
//
//            int ncr = factN / (factR * factRem);

            System.out.print("The number of combinations that you can choose from total items : " + factN/factR);

        }




    }
}
