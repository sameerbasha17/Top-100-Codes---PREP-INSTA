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
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        String str = sc.nextLine();

        str = str.toLowerCase();  // "A" or "a" is treated in same way

        if(isPalindrome(str))
        {
            System.out.printf("%s is a palindrome.",str);
        }
        else
        {
            System.out.printf("%s is not a palindrome.",str);
        }
        
        sc.close();

        
    }

    public static boolean isPalindrome(String str)
    {
        int left = 0, right = str.length()-1;

        while(left < right)  // repeats until the left and right comes to middle of the string
        {
            if(!Character.isLetterOrDigit(str.charAt(left)))  // if the character is other than letter or a digit then it skips
            {
                left ++ ;
            }
            else if(!Character.isLetterOrDigit(str.charAt(right)))   // if the character is other than letter or a digit then it skips
            {
                right -- ;
            }

            else
            {
                if(str.charAt(left) != str.charAt(right))  // match condition
                {
                    return false;
                }

            left ++;        
            right --;

            }
        }
        
            return true;   

    }
}

/* Output :
===========
Case - 1 :
---------
Enter a number : 
09177190
09177190 is a palindrome.

Case - 2 :
---------
Enter a number : 
786689
786689 is not a palindrome.

Case - 3 :
----------
Enter a number : 
MADam
madam is a palindrome.

Case - 4 :
----------
Enter a number : 
12$8*821
12$8*821 is a palindrome.

Case - 5 :
----------
Enter a number : 
123a*****a(321
123a*****a(321 is a palindrome.

Case - 6 :
----------
Enter a number : 
ilov3#3volu
ilov3#3volu is not a palindrome.

*/

/* My Observation :
===================
Works well. skips when the string contains other than letter or numbers ...
 */
