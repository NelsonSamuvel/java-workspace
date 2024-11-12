package practice;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num-1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the num-2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the num-3: ");
        int n3 = sc.nextInt();

        int min = getMin(n1,n2,n3);
        int max = getMax(n1,n2,n3);

        System.out.println("Min of three numbers: " + min);
        System.out.println("Max of three numbers: " + max);
    }



    static int getMin(int n1,int n2,int n3){
        return Math.min(Math.min(n1,n2),n3);
    }

    static int getMax(int n1,int n2,int n3){
        return Math.max(Math.max(n1,n2),n3);
    }

//
//    static int getMin(int n1,int n2,int n3){
//        if(n1 < n2){
//            return Math.min(n1,n3);
//        }
//        return Math.min(n2,n3);
//    }
//
//    static int getMax(int n1,int n2,int n3){
//        if(n1>n2){
//            return Math.max(n1, n3);
//        }
//        else{
//            return  Math.max(n2,n3);
//        }
//
//    }
}
