package com.javapractice.Day40;
import java.util.Scanner;
public class InvertedrtTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of rows");
        int rows=sc.nextInt();
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
