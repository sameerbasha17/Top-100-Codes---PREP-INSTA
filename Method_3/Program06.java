/* 
------------------------------------------------------------------------------------
Program No.   : 06
Program Title : Find the Largest of the Three Numbers
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_3/Program06.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Largest of the Three Numbers.
 ✩ Input  : Three Numbers.
 ✩ Output : A message that prints the "Greatest number among three given numbers".
--------------------------------------------------------------------------------------
*/

// Method-3 : using ternary operator

import java.util.Scanner;

public class Program06 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        if ( number1 == number2 && number2 == number3)
        {
            System.out.println("All numbers are equal. The greatest number is "+number1);
        }
        else
        {
            double result = (number1 > number2) ? (number1 > number3 ? number1 : number3) :(number2 > number3 ? number2 : number3);

            System.out.printf("The Greatest number is %.2f%n",result);

        }

        sc.close();
    }

}

/* Output :
 
case-1 :
---------
Enter three numbers : 
22
-71
1.097
The Greatest number is 22.00

case-2 :
---------
Enter three numbers : 
0917 0917 0917
All numbers are equal. The greatest number is 917.0

*/

/*

My Observation :
----------------
The program was successfully executed.

*/