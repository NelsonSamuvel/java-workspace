package learning;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(list);
//        for(int i=0;i<5;i++){
//            System.out.print("Enter the number for index "+ i +": ");
//            list.add(sc.nextInt());
//        }
//        //access values
//        System.out.println(list.get(3));
//
//        //updating element
//        list.set(0,100);
//
//        //check whether contains the value or not
//        System.out.println(list.contains(8));
//        System.out.println(list);


        //2D ArrayList

        ArrayList<ArrayList<Integer>> li2 = new ArrayList<>();

        for(int i=0;i<3;i++){
            li2.add(new ArrayList<>());
        }

        for(int i=0;i<li2.size();i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the value at the list " + i + ": ");
                li2.get(i).add(sc.nextInt());
            }
        }

        System.out.println(li2);

    }
}
