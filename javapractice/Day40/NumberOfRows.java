package com.javapractice.Day40;

public class NumberOfRows {
        public static void main(String[] args) {
            for (int i = 1; i <= 4; i++) {         // rows
                for (int j = 1; j <= 5; j++) {     // numbers in row
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

