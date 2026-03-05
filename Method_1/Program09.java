/* 
------------------------------------------------------------------------------------
Program No.   : 09
Program Title : Find all the Prime Numbers in a Given Interval
Author        : Shaik Sameer Basha
Date Created  : 16-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program09.java
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
        System.out.println("Enter the initial number : ");
        int start = sc.nextInt();
        System.out.println("Enter the End number :");
        int end = sc.nextInt();

        Program09 obj = new Program09();
        obj.printPrime(start,end);
        
        sc.close();
    }

    void printPrime (int start, int end)
    {
        if(start > end)
        {
            System.out.println("The initial number should greater than or equal to end number.");
            return;
        }
        System.out.printf("The prime numbers between %d and %d are : ",start,end);

        for(int i = start ; i <= end ; i++)
        {
            boolean flag = true;
            if(i < 2 )
                continue;

            for(int j =2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i+" ");
            }
        }
    }
}

/* Output :
=========== 
Case - 1 :
------------
Enter the initial number : 
2
Enter the End number :
7
The prime numbers between 2 and 7 are : 2 3 5 7 

Case - 2 :
-----------
Enter the initial number : 
9
Enter the End number :
7
The initial number should greater than or equal to end number.

Case - 3 :
-----------
Enter the initial number : 
17
Enter the End number :
17
The prime numbers between 17 and 17 are : 17 

*/

/*

My Observation :
----------------
The program is successfully executed.

*/