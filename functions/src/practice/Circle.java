package practice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double circum = circumference(r);
        double area = area(r);
        System.out.println("Circumference of circle: " + String.format("%.3f",circum));
        System.out.println("Area of circle: " + String.format("%.3f",area));
    }

    //radius - distance from center to circle


    //circumference - distance of the boundary-edge of circle

    static double circumference(double r){
        return 2* Math.PI * r;
    }

    //area - a region occupied within boundary

    static double area(double r){
        return Math.PI * Math.pow(r,2);
    }
}
