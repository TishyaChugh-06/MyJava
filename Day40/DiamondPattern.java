package com.javapractice.Day40;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number of rows: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i += 2) {

            for (int space = 0; space < (n - i) / 2; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int space = 0; space < (n - i) / 2; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

