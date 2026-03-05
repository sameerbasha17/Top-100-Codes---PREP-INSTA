/* 
--------------------------------------------------------------------------------------------------------------
Program No.   : 18
Program Title : Factors of a number 
Author        : Shaik Sameer Basha
Date Created  : 26-Oct-2025
Last Modified : 26-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program18.java
--------------------------------------------------------------------------------------------------------------

 ★ PS     : Given an integer number as the input, the objective is to Find all the factors of a Number.
 ✩ Input  : A number.
 ✩ Output : Print the all it's factors.
--------------------------------------------------------------------------------------------------------------
*/

// Using for-loop

import java.util.Scanner;
public class Program18 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        System.out.printf("The factors of %d are : ",number);

        getFactors(number);

        sc.close();
    }
        
    static void getFactors(int number)
    {  
        for(int i = 1; i <= Math.sqrt(number); i ++)
        {
            if(number % i == 0)
            {
                if(i == number/i)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(i + " " + number/i + " ");
                }
                /*{
                    System.out.println(i + " " +"X "+ number/i + " ");
                }*/
            }
        }
    }
    
}

/* Output :
===========
Case - 1 :
----------
Enter a number : 
99
The factors of 99 are : 1 99 3 33 9 11 

Case - 2 :
----------
Enter a number : 
100
The factors of 100 are : 1 100 2 50 4 25 5 20 10 

*/

/* My observation :
===================
It works. but the factors are not printing in the ascending order.

*/