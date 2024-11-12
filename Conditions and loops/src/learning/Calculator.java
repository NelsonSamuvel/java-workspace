package learning;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int res = 0;
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter tow numbers : ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                if(op == '+'){
                    res = n1 + n2;
                } else if (op == '-') {
                    res = n1-n2;
                }else if (op == '*') {
                    res = n1*n2;
                }else if (op == '/') {
                    if(n2 != 0){
                    res = n1/n2;
                    }
                }else{
                    res = n1%n2;
                }
                System.out.println("Result : " + res);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Code Exited");
                break;
            }else {
                System.out.println("Invalid syntax");
            }
        }
    }
}
