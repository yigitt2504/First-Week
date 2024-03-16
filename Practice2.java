package com.firstweek;
import java.util.Scanner;

public class Practice2 {
    public static void main( String[] args ){

        /*Calculate sum of two numbers entered on the keyboard by the user and display the result 
        as the five different forms listed below.*/

        Scanner input=new Scanner(System.in);
        int N1=input.nextInt(), N2=input.nextInt();

        // 1) Within 15 spaces and zeros at the beginning.
        System.out.printf("%015d\n", N1+N2);

        // 2) Within 15 spaces and thousand seperators.
        System.out.printf("%,15d\n", N1+N2);

        // 3) Within 15 spaces, thousand seperators and left-sided.
        System.out.printf("%-,15d\n", N1+N2);

        // 4) Within 12 spaces, a '+' sign in front of it and right-sided.
        System.out.printf("%+12d\n", N1+N2);

        // 5) A '-' sign in front pf it and thousand seperators.
        System.out.printf("-%,d\n", N1+N2);

        input.close();

    }
}
