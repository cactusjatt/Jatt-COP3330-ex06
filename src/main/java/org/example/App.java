/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        Date d = new Date();
        int year = d.getYear();

        int age, retire;
        System.out.print("What is your current age? ");
        age = in.nextInt();
        System.out.print("At what age would you like to retire? ");
        retire = in.nextInt();

        System.out.println("You have " + (retire-age) + " years left until you can retire.");
        System.out.println("It's " + (1900+year) + ", so you can retire in " + (1900+year+(retire-age)) + ".");
        
        in.close();
    }
}
