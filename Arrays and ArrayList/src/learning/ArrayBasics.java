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
        System.out.print("Enter a size: ");

        //in this array is a non-primitive datatype, in which each data is a primitive type
        //by default, the arr is [0,0,0,0,0]
        int n = sc.nextInt();
        int[] res = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the value for array of index " + i +": ");
            res[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(res));

    }
}
