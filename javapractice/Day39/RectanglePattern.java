package com.javapractice.Day39;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter num of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter num of columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i >= 1 && j >= 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
