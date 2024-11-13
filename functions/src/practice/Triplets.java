package practice;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the number3: ");
        int n3 = sc.nextInt();

        if(checkTriplets(n1,n2,n3)){
            System.out.println("It is a pythagorean triplet");
        }
        else{
            System.out.println("It is not a pythagorean triplet");
        }
        sc.close();
    }

    static boolean checkTriplets(int n1,int n2,int n3){

        int a = Math.max(n1,Math.max(n2,n3));
        int b,c;

        if(a == n1){
            b = n2;
            c = n3;
        } else if (a == n2) {
            b = n1;
            c = n3;
        } else  {
            b = n1;
            c = n2;
        }


        return (Math.pow(b,2) + Math.pow(c,2)) == Math.pow(a,2);
    }
}
