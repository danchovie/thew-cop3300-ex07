/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int length, width, area_ft;
        double area_mt;
        System.out.print("What is the length of the room in feet? ");
        length = newScanner.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = newScanner.nextInt();
        area_ft = length*width;
        area_mt = area_ft * 0.09290304;
        System.out.printf("You entered dimensions of %d by %d feet.\nThe area is\n%d square feet\n%.3f square meters", length, width, area_ft, area_mt);
    }
}
