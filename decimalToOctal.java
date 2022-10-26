
package com.mycompany.problemssolving;
import java.io.*;
import java.util.Scanner;

public class decimalToOctal {
    

    static void decToOctal(int n)
    {
       
        int[] ocNum = new int[100];
 
      
        int i = 0;
        while (n != 0) {
 
         
            ocNum[i] = n % 8;
            n = n / 8;
            i++;
        }
 
      
        for (int j = i - 1; j >= 0; j--)
            System.out.print(ocNum[j]);
    }
 
   
    public static void main(String[] args)
    {
      
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n = number.nextInt();
 
     
        decToOctal(n);
    }
}