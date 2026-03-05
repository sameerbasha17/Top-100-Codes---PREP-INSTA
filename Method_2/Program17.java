/* 
-----------------------------------------------------------------------------------------------------------------------------------------------------------
Program No.   : 17
Program Title : Power of a number 
Author        : Shaik Sameer Basha
Date Created  : 26-Oct-2025
Last Modified : 26-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program17.java
-----------------------------------------------------------------------------------------------------------------------------------------------------------

 ★ PS     : Given two integers as the number and power inputs, the objective is to raise the number input to the power input and print the value.
 ✩ Input  : Two numbers (one for number and another for power).
 ✩ Output : Print the power of given input.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
*/

// Using while-loop 

import java.util.Scanner;

public class Program17 
{
    public static void main(String [] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number(base) : ");
        float base = sc.nextFloat();
        System.out.println("Enter the power(exponent) : ");
        float exponent = sc.nextFloat();

        float result = 1.00f;

        while(exponent != 0)
        {
            result = result * base;
            exponent -- ;
        }

        System.out.println("Output : "+result);

        sc.close();
    }

    
}

/* Output :
===========
Case - 1 :
----------
Enter a number(base) : 
2
Enter the power(exponent) : 
3
Output : 8.0

Case - 2 :
----------
Enter a number(base) : 
9
Enter the power(exponent) : 
7
Output : 4782969.0

Case - 3 :
----------
Enter a number(base) : 
-7
Enter the power(exponent) : 
3
Output : -343.0

Case - 4 :
----------
Enter a number(base) : 
0
Enter the power(exponent) : 
0
Output : 1.0

*/

/* My observation :
===================
works good, i am getting understanding the use of while loop.
*/
