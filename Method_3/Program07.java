/* 
------------------------------------------------------------------------------------
Program No.   : 07
Program Title : Check Whether or Not the Year is a Leap Year
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_3/Program07.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether or Not the Year is a Leap Year in Java.
 ✩ Input  : A number(year).
 ✩ Output : A message that prints "Leap year or not".
--------------------------------------------------------------------------------------
*/

// Bonus Boolean Method

import java.util.Scanner;

public class Program07 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if(year < 0)
        {
            System.out.println("Invalid year. Please enter a valid year !");
            sc.close();
            return;
        }

        boolean flag = false;
        if(year % 400 ==0)
        {
            flag = true;
        }
        if(year % 400 == 0 || year % 4 == 0 && year%100 !=0 )
        {
            flag = true;
        }
        if(flag)
            System.out.printf("%d is a leap year.%n",year);
        else
            System.out.printf("%d is not a leap year.%n",year);
        
        sc.close();
    }
    
}

/* Output :
============
Case - 01 :
------------
Enter a year : 
2006
2006 is not a leap year.

Case - 02 :
------------
Enter a year : 
2016
2016 is a leap year.

Case - 03 :
-----------
Enter a year : 
-1790
Invalid year. Please enter a valid year !

*/

/*

My Observation :
----------------
The program is executed Successfully.

*/