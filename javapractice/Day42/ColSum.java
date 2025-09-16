package com.javapractice.Day42;
import java.util.Scanner;

    public class ColSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] arr = new int[4][4];

            System.out.println("Enter num:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Sum of column:");
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    sum += arr[i][j];
                }
                System.out.println("Column " + (j + 1) + " sum = " + sum);
            }
        }
    }


