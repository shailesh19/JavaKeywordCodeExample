package com.stackroute.javakeywords.arrayimplementation;

import java.util.Scanner;

public class Array
{
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] sampleArray = new int[size];

    public int[] arrayImplementation()
    {
       for (int i = 0; i < size; i++)
       {
           sampleArray[i] = scanner.nextInt();
           sum = sum + sampleArray[i];
       }
       System.out.println("Sum: " +sum);
       return sampleArray;
    }
}
