/* 
------------------------------------------------------------------------------------
Program No.   : 10
Program Title : Find the Sum of the Digits of a Number
Author        : Shaik Sameer Basha
Date Created  : 17-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program10.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Sum of the Digits of a Number in Java.
 ✩ Input  : A number.
 ✩ Output : A message that displays sum of digits of given number.
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program10 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = sc.nextLine();

        Program10 obj = new Program10();
        System.out.println("The sum of digit in " + number + " is : "+ obj.getSum(number));
        
        sc.close();
    }   

    int getSum(String number)
    {
        int sum = 0;
        for(int i = 0; i < number.length(); i++)
        {
            char ch = number.charAt(i);
            if(Character.isDigit(ch))                          // Explanation is provided at bottom after output (refer there)
            {
            sum += ch - '0';
            }      
        }

        return sum;
    }
}

/* Output :
 ===========
 Case - 1 :
 -----------
Enter a number :
143
The sum of digit in 143 is : 8

Case - 2 :
----------
Enter a number :
-143
The sum of digit in -143 is : 8

*/

/* Explanation for getSum()

☆ In this method i am using a string to take the input from the user. The user enters a number but we store it as a string.
☆ we access each and every character in the String by using String_name.charAt(index).
☆ And we should check each character whether it is a digit or not .
☆ If digit :
    we calculate the sum . i have taken sum = sum + ch - '0'. Or in other words sum = sum + number.charAt(i) - '0' => It returns the actual number not the ASCII value since we subtracted it by '0' (or 48 in ASCII).
☆ If not digit : (ex : '-','a',' ')
    skip
☆ Return the sum

It is not the exact algorithm, it's like a notes for understanding purpose.

My Observation :
-----------------
The program is executed successfully.

*/
