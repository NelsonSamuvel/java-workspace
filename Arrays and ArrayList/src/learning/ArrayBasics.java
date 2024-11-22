package learning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        //for primitive types the initial value before assignment is 0 or false

////        int[] arr = new int[5];
////        System.out.println(arr[1]);
//
//
//        //for non-primtive types, it is null
//        String[] str = new String[4];
//        System.out.println(str[2]);
//
//        String str1 = null;
//        System.out.println(str1);

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a size: ");
//
//        //in this array is a non-primitive datatype, in which each data is a primitive type
//        //by default, the arr is [0,0,0,0,0]
//        int n = sc.nextInt();
//        int[] res = new int[n];
//        for (int i=0;i<n;i++){
//            System.out.print("Enter the value for array of index " + i +": ");
//            res[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(res));

        //2D Arrays

//        int[][] res1 = {
//                {1,2,3},
//                {4,5},
//                {7,8},
//                {9}
//        };
//        System.out.print("[");
//        for (int i=0;i<res1.length;i++){
//            System.out.println(Arrays.toString(res1[i]));
//        }
//        System.out.print(" ]");


        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print("Enter the value for row " + i +" col " + j +": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        for (int[] num : arr) {
//            System.out.println(Arrays.toString(num));
//        }
    }
}
