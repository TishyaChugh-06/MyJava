package com.javapractice.Day41;

import java.util.Scanner;

public class RemoveOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int removeValue = sc.nextInt();

        int value = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != removeValue){
                arr[value] = arr[i];
                value++;
            }
        }

        System.out.print("Array after removing " + removeValue + " is: ");
        for(int j = 0; j < value; j++){
            System.out.print(arr[j] + " ");
        }
    }
}



