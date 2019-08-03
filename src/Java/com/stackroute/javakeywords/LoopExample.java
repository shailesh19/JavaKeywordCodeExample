package com.stackroute.javakeywords;

import java.util.Scanner;

public class LoopExample
{
    public int fiboExample(int n)
    {
        int firstno = 0, secondno = 1, nextnumber;

        if (n == 0)             //conditional statement
            return firstno;
        System.out.println(firstno);
        System.out.println(secondno);
        for (int i = 2; i <= n; i++)            // loop for printing the fibo series
        {
            nextnumber = firstno + secondno;
            firstno = secondno;
            secondno = nextnumber;
            System.out.println(secondno);
        }
        return secondno;
    }
}
