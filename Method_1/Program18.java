/* 
--------------------------------------------------------------------------------------------------------------
Program No.   : 18
Program Title : Factors of a number 
Author        : Shaik Sameer Basha
Date Created  : 26-Oct-2025
Last Modified : 26-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program18.java
--------------------------------------------------------------------------------------------------------------

 ★ PS     : Given an integer number as the input, the objective is to Find all the factors of a Number.
 ✩ Input  : A number.
 ✩ Output : Print the all it's factors.
--------------------------------------------------------------------------------------------------------------
*/

// Using for-loop

import java.util.*;
public class Program18 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        
        /* 

        for(int i = 1; i <= number; i++)       // [1, number]
        {
            if(number % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        
        */

        
        for(int i =1 ; i<= (number/2); i++)   // [1, number/2]
        {
            if(number % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.print(number);

        sc.close();

    }
    
}

/* Output:
==========
Case - 1 :
----------
Enter a number : 9
1 3 9

Case - 2 :
----------
Enter a number : 100
1 2 4 5 10 20 25 50 100

Case - 3 :
----------
Enter a number : 0
0

Case - 4 :
----------
Enter a number : -17   // I have written this program for only positive numbers.
-17

*/

/* My Observation :
====================
Works good . Here it used for only positive numbers.

*/