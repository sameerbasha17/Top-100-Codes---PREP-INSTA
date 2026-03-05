/* 
------------------------------------------------------------------------------------
Program No.   : 09
Program Title : Find all the Prime Numbers in a Given Interval
Author        : Shaik Sameer Basha
Date Created  : 16-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program09.java
-------------------------------------------------------------------------------------

 ★ PS     : Find all the Prime Numbers in a Given Interval in Java.
 ✩ Input  : Two numbers - initial and end numbers in the range.
 ✩ Output : A message that displays all prime numbers in given range.
--------------------------------------------------------------------------------------
*/



import java.util.Scanner;

public class Program09 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number in the range : ");
        int initial = sc.nextInt();
        System.out.println("Enter the last number in the range : ");
        int last = sc.nextInt();

        printPrime(initial,last);

        sc.close();

    }  

    static void printPrime(int initial,int last)
    {
        boolean hasPrime = false;
        System.out.printf("The prime numbers between %d and %d are : ",initial,last);
        for( int i = initial; i <= last; i++)
        {
            boolean flag = true;

            if(i < 2)
                continue;

            for(int j = 2;j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i + " ");
                hasPrime = true;
            }
        }

        if(!hasPrime)
        {
            System.out.printf("There are no prime numbers between %d and %d !", initial,last);
        }
    }
}

/* Output :
============
Case - 1 :
-----------
Enter the initial number in the range : 
24
Enter the last number in the range : 
56
The prime numbers between 24 and 56 are : 29 31 37 41 43 47 53 

Case -2 :
-----------
Enter the initial number in the range : 
-24
Enter the last number in the range : 
0
The prime numbers between -24 and 0 are : There are no prime numbers between -24 and 0 !

*/

/*

My Observation :
----------------
The program was executed successfully.\

*/