/* 
------------------------------------------------------------------------------------
Program No.   : 12
Program Title : Check Whether or Not the Number is a Palindrome
Author        : Shaik Sameer Basha
Date Created  : 22-Oct-2025
Last Modified : 22-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program12.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether or Not the Number is a Palindrome in Java.
 ✩ Input  : A number.
 ✩ Output : A message says the given number is palindrome or not.
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program12 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int reverse = 0, remainder =0, num = number ;

        while(number != 0 )
        {
            remainder = number % 10 ;
            reverse = reverse*10 + remainder;
            number /= 10; 
        }

        String result = (num == reverse)? "palindrome" : "not a palindrome";

        System.out.printf("%d is %s.",num,result);
        sc.close();
    }
    
}

/* Output :
===========
Case - 1 :
----------
Enter a number : 
78977987
78977987 is palindrome.

Case - 2 :
----------
Enter a number : 
1234
1234 is not a palindrome.
*/

/* My Observation :
===================
The program is executed successfully. Using the reversing the number and matchup with original number strategy looks little bit tricky.
*/
