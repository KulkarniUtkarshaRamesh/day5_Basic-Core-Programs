package com.bridgelabz;
import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        System.out.print("Enter a number- ");
        int num = check.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even no.");
        else
            System.out.println(num + " is odd no.");
        check.close();
    }
}


