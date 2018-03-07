package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;

        out.println("Welcome to Multiplication Tables.");
        out.println("How large would you like to see them?");
        size = keyboard.nextInt();

        if (size > 20) {
            out.println("Please enter another number less than or equal to 20");
            size = keyboard.nextInt();
        }

        for (int a = 0; a <= size; a++)
        {
            for (int b = 0; b <= size; b++)
            {
                out.println(a + " x " + b + " = " + a*b);
            }
            out.println();
        }


    }
}