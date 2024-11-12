package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Highest Common Factor - the largest common number which divides both the given number.


//Algorithm :
    //1. find prime factors of both the numbers - prime factors means that the divisor needs to be prime number
    //2. Add those prime factors into separate list
    //3. find the common values between two list
    //4. the product of the common values is the prime number.

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        if(a <0 || b<0){
            System.out.println("Invalid inputs a or b");
            return;
        }

        List<Integer> factorsA = primeFactors(a);
        List<Integer> factorsB = primeFactors(b);

        System.out.println(factorsA);
        System.out.println(factorsB);

        int HCF =  1;
        ArrayList<Integer> res = new ArrayList<>();

        for(Integer factor : factorsA){
            if(factorsB.contains(factor)){
                res.add(factor);
                factorsB.remove(factor);
            }
        }

        for(Integer factor : res){
            HCF *= factor;
        }

        System.out.println(HCF);
        sc.close();

    }

    static List<Integer> primeFactors(int num){
        int divisor = 2;
        ArrayList<Integer> factors = new ArrayList<>();
        while (num > 1){
            if(isPrime(divisor)){
                while (num % divisor == 0){
                    factors.add(divisor);
                    num = num/ divisor;
                }
            }
                divisor++;
        }
        return factors;
    }

    static boolean isPrime(int n){
        int c = 2;
        if(n < 2) return false;
        while (c <= Math.sqrt(n)){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
