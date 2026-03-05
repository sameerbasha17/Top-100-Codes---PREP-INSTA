/* 
------------------------------------------------------------
Program No.   : 01
Program Title : Check if a number is positive, negative, or zero
Author        : Shaik Sameer Basha
Date Created  : 13-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program01.java
------------------------------------------------------------

 ★ PS     : Check given number is positive or negative.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the number is "positive" or "negative" or "zero".
-------------------------------------------------------------
*/

import java.util.Scanner;
class Program01
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        // Brute force method through if-else

        if(number > 0)
        {
            System.out.printf("%d is a positive number.",number);
        }
        else if(number<0)
        {
            System.out.printf("%d is a negative number.",number);
        }
        else{
            System.out.println("The number is zero");
        }
        sc.close();
    }
}

/* Output:
===========
Case - 1 :
---------
Enter the number : 
09 
9 is a positive number.

Case - 2 :
---------
Enter the number : 
-7
-7 is a negative number.

Case - 3 :
----------
Enter the number : 
0
The number is zero

*/


/* 
My Observation:
===============
Ternary operator makes this program well . So, i want to use the ternary operator and also add input integer validation in Method_2/Program01.java
*/
