package com.firstweek;
import java.util.Scanner;

public class Practice1 
{
    public static void main( String[] args ){
        
        /* Calculate the squares of the double numbers entered on the keyboard and display them as the 7 different forms listed below. */

        Scanner input = new Scanner(System.in);
        double N1 = input.nextDouble();

        // 1) Only with two digits after the dot.
        System.out.printf("%.2f\n", N1*N1);

        // 2) Only with two digits after the dot and a '+' sign in front of it.
        System.out.printf("%+.2f\n", N1*N1);

        // 3) Within 10 spaces and left-sided.
        System.out.printf("%-10f\n", N1*N1);

        // 4) Within 15 spacces, three digits after the dot and left-sided.
        System.out.printf("%-15.3f\n", N1*N1);

        // 5) Within 20 spaces, three digits after the dot and right-sided.
        System.out.printf("%20.3f\n", N1*N1);

        // 6) With thousand seperator and four digits after the dot.
        System.out.printf("%,.4f\n", N1*N1);

        // 7) Within 15 spaces, zeros at the beginning and three digits after the dot.
        System.out.printf("%015.3f\n", N1*N1);

        input.close();
        
    }
}
