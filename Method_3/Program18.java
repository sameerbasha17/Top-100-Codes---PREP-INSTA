/* 
--------------------------------------------------------------------------------------------------------------
Program No.   : 18
Program Title : Factors of a number 
Author        : Shaik Sameer Basha
Date Created  : 26-Oct-2025
Last Modified : 26-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_3/Program18.java
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
        int i;
        boolean flag = false;
        for(i = 1; i <= Math.sqrt(number); i ++)
        {
            
            if(number % i == 0)
            {
                System.out.print(i+" ");

                if(i == number/i)
                {
                    flag = true;
                }
            }
            
        }
        
        i = (flag)?(i-2) : (i-1);

        for(;i >= 1 ; i--)
        {
            if(number % i == 0)
            {
                System.out.print(number/i  +  " ");
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
The factors of 99 are : 1 3 9 11 33 99 

Case - 2 :
----------
Enter a number : 
100
The factors of 100 are : 1 2 4 5 10 20 25 50 100  

*/

/* My observation :
===================
The program was executed successfully. we can use i*i <= number in the for loop instead of Math.sqrt().

*/