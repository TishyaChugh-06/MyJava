package com.javapractice.Day42;
import java.util.Scanner;
import java.util.Arrays;

public class LargestElement {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter num of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            int max=arr[i][0];
            for(int j=0;j<col;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println("maximum:" + max);

        }


    }
}
