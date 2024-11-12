package learning;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Operator : ");
        char op = sc.next().trim().charAt(0);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        switch (op){
            case '+' -> System.out.println(n1+n2);
            case '-' -> System.out.println(n1-n2);
            case '*' -> System.out.println(n1*n2);
            case '/' -> {
             if(n2!=0){
                 System.out.println(n1/n2);
             }
            }
            case '%' -> System.out.println(n1%n2);
        }
    }
}
