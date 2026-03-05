/* 
------------------------------------------------------------------------------------
Program No.   : 07
Program Title : Check Whether or Not the Year is a Leap Year
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program07.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether or Not the Year is a Leap Year in Java.
 ✩ Input  : A number(year).
 ✩ Output : A message that prints "Leap year or not".
--------------------------------------------------------------------------------------
*/

// Using if-else statement

import java.util.Scanner;

public class Program07 
{
    public static void main(String [] args )
    {
        System.out.println("Enter a year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0)))
        {
            System.out.printf("%d is a leap year.%n",year);
        }

        else
        {
            System.out.printf("%d is not a leap year.%n",year);
        }

        sc.close();
    }
    
}

/* Output :
 
Case - 01 :
------------
Enter a year : 
2024
2024 is a leap year.

Case - 02 :
-------------
Enter a year : 
1997
1997 is not a leap year.

*/

/* 

My Observaton :
---------------
The program is executed successfully. Here i didn't add input validation.
 */
