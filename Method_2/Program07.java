/* 
------------------------------------------------------------------------------------
Program No.   : 07
Program Title : Check Whether or Not the Year is a Leap Year
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program07.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether or Not the Year is a Leap Year in Java.
 ✩ Input  : A number(year).
 ✩ Output : A message that prints "Leap year or not".
--------------------------------------------------------------------------------------
*/

//Using ternary Operator

import java.util.Scanner;

public class Program07
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        if(year < 0)             // for negative years
        {
            System.out.println("Enter a valid year. Please try again !!!");
            sc.close();
            return;
        }

        String result = ((year % 400==0)||((year % 4 ==0)&&(year % 100 != 0)))? "leap year": "not a leap year";

        System.out.printf("%d is a %s%n",year,result);

        sc.close();
    }
    
}

/* Output :
===========
Case - 01 :
------------
Enter a year : 
1997
1997 is not a leap year.

Case - 02 :
-----------
Enter a year : 
2032
2032 is a leap year

Case - 03:
----------
Enter a year : 
-1709
Enter a valid year. Please try again !!!

*/

/*

My Observation :
----------------
The program was successfully executed.
 */
