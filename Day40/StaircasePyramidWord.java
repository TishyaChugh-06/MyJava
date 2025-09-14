package com.javapractice.Day40;
import java.util.Scanner;
public class StaircasePyramidWord {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
   String wrd= sc.nextLine();
   int len = wrd.length();
   for(int i=0;i<len;i++){
       for(int j=i;j<len;j++){
       char ch=wrd.charAt(j);
       System.out.print(ch);
       }
    System.out.println();
   }

}
}
