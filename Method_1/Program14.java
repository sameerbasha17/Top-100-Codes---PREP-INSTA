/* 
----------------------------------------------------------------------------------------------------------------
Program No.   : 14
Program Title : Find the Armstrong Numbers in a given Range using Java
Author        : Shaik Sameer Basha
Date Created  : 23-Oct-2025
Last Modified : 23-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program14.java
-----------------------------------------------------------------------------------------------------------------

 ★ PS     : Given two integer inputs as high and low, the objective is to find all the Armstrong Numbers that falls under the limits [Low,High] interval.
 ✩ Input  : Two positive numbers(low,high)
 ✩ Output : Print all the Armstrong numbers in the given Range.
------------------------------------------------------------------------------------------------------------------
*/

// Armstrong number => abcd = a^n + b^n + c^n + d^n

import java.util.Scanner;

public class Program14
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the low number in the range : ");
        int low = sc.nextInt();
        System.out.println("Enter the high number in the range : ");
        int high = sc.nextInt();

    
        if(low > high)                       // Triggers when lower bound is greater than the upper bound.
        {
            System.out.println("The low value must be less than or equal to high value. Please enter a valid input. ");
            System.exit(0);
        }
        int count = 0;
        for(int i = low; i <= high; i++)
        {
            if(i < 0)                        // skip the iteration for negative numbers. Because -ve are not Armstrong numbers.
            {
                continue;
            }

            int len = length(i);            // calls the length() method and gets the length of number.
            int sum = 0, digit = 0, j = i;
            while(j != 0)
            {
                digit = j % 10;
                sum +=(int)Math.pow(digit,len);
                j /= 10;
            }
            if(i == sum)
            {
                System.out.print(i+" ");        // print Armstrong numbers.
                count +=1;
            }

           
        }
        System.out.println();
        System.out.printf("Number of Armstrong numbers in the rage [%d,%d] : %d%n",low,high,count); //count
        if(count == 0)
        {
            System.out.printf("There are no Armstrong numbers in the range [%d,%d].%n",low,high);
        }

        sc.close();
    }

    static int length(int i)
    {
        int count = 0;                           // int len = String.valueOf(i).length()
        while(i != 0)
        {
            i = i/10;
            count ++;
        }
        return count;
    }
}

/*
Output(Test Cases):
===================
Case - 1 :
-----------
Enter the low number in the range : 
1
Enter the high number in the range : 
1000
1 2 3 4 5 6 7 8 9 153 370 371 407 
Number of Armstrong numbers in the rage [1,1000] : 13

Case - 2 :
----------
Enter the low number in the range : 
-100
Enter the high number in the range :
-1

Number of Armstrong numbers in the rage [-100,-1] : 0
There are no Armstrong numbers in the range [-100,-1].

Case - 3 :
----------
Enter the low number in the range : 
100
Enter the high number in the range : 
1
The low value must be less than or equal to high value. Please enter a valid input. 

Case - 4 :
----------
Enter the low number in the range : 
-10000
Enter the high number in the range : 
10000
0 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474 
Number of Armstrong numbers in the rage [-10000,10000] : 17

Case - 5 :     // for large input
----------
Enter the low number in the range : 
-1234567890
Enter the high number in the range : 
1234567890
0 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474 54748 92727 93084 548834 1741725 4210818 9800817 9926315 24678050 24678051 88593477 146511208 472335975 534494836 912985153 
Number of Armstrong numbers in the rage [-1234567890,1234567890] : 32

*/

/*
My Observation :
================
The program was successfully executed. I am getting understanding how to handle different scenario's when user enter a input.
*/