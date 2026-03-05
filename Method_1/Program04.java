/* 
--------------------------------------------------------------------------
Program No.   : 04
Program Title : Find the Sum of all the Numbers that lay in the range.
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program04.java
---------------------------------------------------------------------------

 ★ PS     : Find the Numbers that lay in the given interval.
 ✩ Input  : Inital and End values of the range.
 ✩ Output : A message that prints the "sum" of all numbers in given range.
----------------------------------------------------------------------------
*/

// Method-1 : Brute force 

import java.util.Scanner;

public class Program04 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial number : ");
        int start_number = sc.nextInt();
        System.out.println("Enter the End number : ");
        int end_number = sc.nextInt();

        if(start_number > end_number)
        {
            System.out.println("The initial number should be less then End number. Please enter a valid input !!");
        }
        else
        {   
            int result = 0;
            for(int i = start_number; i<=end_number; i++)
            {
                result +=i;
            }

            System.out.printf("The sum of all numbers between %d and %d is %d",start_number,end_number,result);

        }
        sc.close();
    }
    
}

/* Output :
===========
Case - 1 :
----------
Enter initial number : 
7
Enter the last number : 
9
The sum of all numbers between 7 and 9 is 24

Case - 2 :
----------
Enter initial number : 
17
Enter the End number : 
09
The initial number should be less then End number. Please enter a valid input !!

Case - 3 :
----------
Enter initial number : 
-804
Enter the End number : 
-705
The sum of all numbers between -804 and -705 is -75450

 */

 /* My Observation :
=====================
This program is executed successfully. I think no enchancements are needed.
  */
