/* 
------------------------------------------------------------------------------------
Program No.   : 10
Program Title : Find the Sum of the Digits of a Number
Author        : Shaik Sameer Basha
Date Created  : 17-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_3/Program10.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Sum of the Digits of a Number in Java.
 ✩ Input  : A number.
 ✩ Output : A message that displays sum of digits of given number.
--------------------------------------------------------------------------------------
*/

// Handles even if input is negative.


import java.util.Scanner;

public class Program10 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        number = Math.abs(number);   // Takes only magnitude, ignores the sign of the number(always number is treated as positive).

        System.out.println("The sum of digits in " + number + " is : " + getSum(number));   // print the output

        sc.close();
    }    

    static int getSum(int num)
    {
        int sum = 0 , rem = 0;
        while(num != 0)
        {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum; // returns the sum value to the calling function
    }
}

/* Output :
===========
Case - 01 :
-----------
Enter a number :
134
The sum of digits in 134 is : 8

Case - 02 :
-----------
Enter a number :
-134
The sum of digits in 134 is : 8

*/

/*

My Observation :
----------------
The program is successfully executed.

*/