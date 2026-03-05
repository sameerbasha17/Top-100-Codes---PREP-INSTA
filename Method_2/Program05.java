/* 
--------------------------------------------------------------------------
Program No.   : 05
Program Title : Find the Greatest of the Two Numbers in Java.
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program05.java
---------------------------------------------------------------------------

 ★ PS     : Find the Greatest of the Two Numbers in Java.
 ✩ Input  : Two numbers.
 ✩ Output : A message that prints the Greatest number.
----------------------------------------------------------------------------
*/

// Method-2 : Ternary Operator

import java.util.Scanner;

public class Program05 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();

        if(number1 == number2)
        {
            System.out.println("Both numbers are equal.");
        }
        else
        {
            int result = number1 > number2 ? number1 : number2;

            System.out.printf("%d is the greatest number.%n",result);

        }

        sc.close();
    }
    
}

/* Output :
 
case-1 : 
---------
Enter number 1 :
17
Enter number 2 : 
9
17 is greatest number.

case-2 :
---------
Enter number 1 :
-1
Enter number 2 : 
-7
-1 is greatest number.

case-3 :
---------
Enter number 1 :
69
Enter number 2 : 
69
Both numbers are equal.

*/

/* My Observation :
===================
The Program was executed successfully. Now, i think i am good at using the ternary Operator.
 */