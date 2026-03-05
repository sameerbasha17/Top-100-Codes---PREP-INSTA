/* 
------------------------------------------------------------------------------------
Program No.   : 10
Program Title : Find the Sum of the Digits of a Number
Author        : Shaik Sameer Basha
Date Created  : 17-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program10.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Sum of the Digits of a Number in Java.
 ✩ Input  : A number.
 ✩ Output : A message that displays sum of digits of given number.
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program10 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        sum_Of_Digits(number);     // Calling with parameter

        sc.close();
    }   

    static void sum_Of_Digits(int number)
    {
        int sum = 0, temp = 0;
        int num = number;      // taken, because we want to print number using format specifier at the end of the loop. At the end of the loop number becomes zero, so i have taken a duplicate variable.
        while(number != 0)
        {
            temp = number % 10;    // finds the remainder with 10 (last digit of the given number).
            sum +=temp;            // Adding the each digit in the given number.
            number /= 10;          // Eleminating the last digit of the given number by dividing number with 10.
        }

        System.out.printf("The sum of digits in %d is : %d%n",num,sum);
    }
}

/* Output :
============
Case - 1 :
----------
Enter a number : 
143
The sum of digits in 143 is : 8

Case - 2 :
----------
Enter a number : 
0
The sum of digits in 0 is : 0

Case - 3 :
----------
Enter a number : 
-79
The sum of digits in -79 is : -16   => which is mathematically wrong, so i write this program in method 3 in more effectient way(to handle even number in negative), so you can check out there.
*/

/*

My Observation : 
----------------
Works nice, but when a negative number is given as input, it prints the output in negative. So, i have written to calculate only magnitude in method_2/Program10.java

 */