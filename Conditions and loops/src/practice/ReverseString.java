package practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int size = name.length();
        if(size>0){
            StringBuilder res = new StringBuilder(size);
            for(int i = size-1;i>=0;i--){
                res.append(name.charAt(i));
            }
            if(name.split(" ").length > 1){
                String[] nameArr = res.toString().split(" ");
                res = new StringBuilder();
                for(int i = nameArr.length-1;i>=0;i--){
                    res.append(nameArr[i]).append(" ");

                }
                res = new StringBuilder(res.toString().trim());
            }

            System.out.println("The reversed string : " + res);
        }
        else{
            System.out.println("The String is empty");
        }
        sc.close();
    }
}
