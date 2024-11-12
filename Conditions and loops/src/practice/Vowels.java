package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter : ");
        char ch = sc.next().trim().charAt(0);
        int asc = (int)ch;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
//        char[] vowels = {'a','e','i','o','u'};
        if(asc>=65 && asc<=90 || asc>=97 && asc <= 122){
            if(vowels.contains(Character.toLowerCase(ch))){
                System.out.println(ch + " is a vowel");
            }
            else{
                System.out.println(ch + " is a consonant");
            }
        }
        else{
            System.out.println("Please enter a letter");
        }

        sc.close();

    }
}
