package com.javapractice.Day42;

import java.util.Scanner;
class LastFirstRow {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter columns: ");
            int cols = sc.nextInt();

            int[][] arr = new int[rows][cols];


            System.out.println("Enter  elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("First Row:");
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[0][j] + " ");
            }
            System.out.println();

            System.out.println("Last Row:");
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[rows - 1][j] + " ");
            }
        }
    }


