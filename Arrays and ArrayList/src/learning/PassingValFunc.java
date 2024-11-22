package learning;

import java.util.Arrays;

public class PassingValFunc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        changeVal(arr);
        System.out.println(Arrays.toString(arr));
    }

    //while passing values into a function, both nums and original variable arr points to same object []

    static void changeVal(int[] num){
        num[1] = 25;
    }
}
