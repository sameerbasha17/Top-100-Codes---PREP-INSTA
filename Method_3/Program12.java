/* 
------------------------------------------------------------------------------------
Program No.   : 12
Program Title : Check Whether or Not the Number is a Palindrome
Author        : Shaik Sameer Basha
Date Created  : 22-Oct-2025
Last Modified : 22-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program12.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether or Not the Number is a Palindrome in Java.
 ✩ Input  : A number.
 ✩ Output : A message says the given number is palindrome or not.
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program12 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = sc.nextLine();

        if(isPalindrome(number))
        {
            System.out.printf("%s is a palindrome.",number);
        }
        else
        {
            System.out.printf("%s is not a palindrome.",number);
        }
        
        sc.close();
    }

    private static boolean isPalindrome(String str)
    {
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse))
        {
            return true;
        }

        return false;
    }
    
}

/* Output :
===========
Case - 1 :
----------
Enter a number : 
143341
143341 is a palindrome.

Case - 2 :
----------
Enter a number : 
7878
7878 is not a palindrome.

Case - 3 :
----------
Enter a number : 
1@#7#@1
1@#7#@1 is a palindrome.

Case - 4 :
----------
Enter a number : 
1@#1
1@#1 is not a palindrome.

*/

/* My Observation :
===================
Works nice, In this program i learnt the use of StringBuilder class.
*/
