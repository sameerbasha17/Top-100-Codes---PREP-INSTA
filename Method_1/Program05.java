/* 
--------------------------------------------------------------------------
Program No.   : 05
Program Title : Find the Greatest of the Two Numbers in Java.
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program05.java
---------------------------------------------------------------------------

 ★ PS     : Find the Greatest of the Two Numbers in Java.
 ✩ Input  : Two numbers.
 ✩ Output : A message that prints the Greatest number.
----------------------------------------------------------------------------
*/

// Method-1: if-else statement

import java.util.Scanner;

public class Program05 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();

        if(number1 > number2)
        {
            System.out.printf("%d is the greatest number.%n",number1);
        }
        else if(number1 < number2)
        {
            System.out.printf("%d is the greatest number.%n",number2);
        }
        else{
            System.out.printf("Both numbers are equal.%n");
        }

        sc.close();
    }
    
}

/* Output :
case -1 :
---------
Enter number 1 : 
0
Enter number2 : 
9
9 is the greatest number.

case-2 :
---------
Enter number 1 : 
-98
Enter number2 : 
-9
-9 is the greatest number.

case-3 :
---------
Enter number 1 : 
7
Enter number2 : 
7
Both numbers are equal.

*/

/* My Observation :
===================
Works good. But, times like this ternary operator is best choice. So, i used ternary operator in method_2/Program05.java
*/
