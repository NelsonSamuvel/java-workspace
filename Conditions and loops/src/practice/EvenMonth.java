package practice;

import java.util.Scanner;

public class EvenMonth {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=30;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Final Count: " + count);
    }
}
