/* 
------------------------------------------------------------------------------------
Program No.   : 08
Program Title : Check Whether a Given Number is Prime or Not
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program08.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether a Given Number is Prime or Not in Java.
 ✩ Input  : A number.
 ✩ Output : A message that prints given number is prime or not.
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program08 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        boolean flag = true;
        if(number < 2)
        {
           flag = false;
        }
        else
        {
            
            for(int i = 2;i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
        {
            System.out.printf("%d is a prime number.%n",number);
        }
        else
        {
            System.out.printf("%d is not a prime number.%n",number);
        }
        

        sc.close();
    }
    
}

/* Output : 
 
Case - 01 :
------------
Enter a number(Greater than 0) :
9
9 is not a prime number.

Case - 02 :
------------
Enter a number(Greater than 0) :
7
7 is a prime number.

Case- 03 :
-------------
Enter a number :
-917
-917 is not a prime number.

*/

/*

My Observation :
----------------
The program was successfully executed.

*/