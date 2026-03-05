/* 
----------------------------------------------------------------------------------------------------------------
Program No.   : 15
Program Title : Find the Fibonacci Series up to Nth Term
Author        : Shaik Sameer Basha
Date Created  : 25-Oct-2025
Last Modified : 25-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program15.java
-----------------------------------------------------------------------------------------------------------------

 ★ PS     : For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term.
 ✩ Input  : A number(Nth term).
 ✩ Output : Print the fibonacci series upto Nth term.
------------------------------------------------------------------------------------------------------------------
*/

import java.util.*;

public class Program15 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term : ");
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid input! Please enter a valid input.");
            sc.close();
            return;
        }

        int a = 0, b =1;
        System.out.print(a + " , " + b );

        for(int i = 3; i <= n ; i++)
        {
            int next_term = a + b;
            a = b;
            b = next_term;
            System.out.print( " , " +next_term );
        }

        sc.close();

        
    }
    
}

/* Output :
============
Case - 1 :
----------
Enter the Nth term : 
9
0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21

Case - 2:
---------
Enter the Nth term : 
-7
Invalid input! Please enter a valid input.
*/

/* My Observation :
===================
Works good. I did not write a input validation for n = 1 and 2.
*/
