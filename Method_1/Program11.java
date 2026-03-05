/* 
------------------------------------------------------------------------------------
Program No.   : 11
Program Title : Find the Reverse of a Number
Author        : Shaik Sameer Basha
Date Created  : 18-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program11.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Reverse of a Number in Java.
 ✩ Input  : A number.
 ✩ Output : A message that displays reverse of given number.
--------------------------------------------------------------------------------------
*/


import java.util.Scanner;

public class Program11
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("The reverse of " + number + " is : "+getReverse(number));

        sc.close();
    }

    static int getReverse(int num)
    {
        int sum = 0, rem =0;

        while(num !=0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }

        return sum;
    }
}

/* Output :
===========
Case - 1 :
-----------
Enter a number : 
123
The reverse of 123 is : 321

Case - 2 :
-----------
Enter a number : 
-123
The reverse of 123 is : -321

Case - 3 :
-----------
Enter a number :                // This happens because the int type variable stores as 1 instead of 00001 (it ignores leading 0's).
00001
The reverse of 1 is : 1        // if you want to get 10000 then refer Program 11 in Method 3.

*/

/*

My Observation :
----------------
Works nice, but i want to write a program that even handles Case - 3.

*/

