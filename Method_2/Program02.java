/* 
------------------------------------------------------------
Program No.   : 02
Program Title : Check if a number is even or odd
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program02.java
------------------------------------------------------------

 ★ PS     : Check given number is Even or Odd.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the number is "Even" or "Odd".
-------------------------------------------------------------
*/


import java.util.Scanner;

public class Program02 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        
        if(!sc.hasNextInt())                                // Added input validation 
        {
            System.out.println("Invalid input ! Please enter a valid input.");
            sc.close();
            return;
        }

        int number = sc.nextInt();

        String result = number % 2 == 0 ? "even" : "odd";     // Used ternary operator for coincise decision making

        System.out.printf("%d is %s",number,result);

        sc.close();
    }
}

/* Output :
==========================
Case - 1:
---------
Enter a number : 
7
7 is odd

Case - 2 :
-----------
Enter a number : 
0
0 is even

Case - 3 :
-----------
Enter a number : 
-9
-9 is odd

Case - 4 :
-----------
Enter a number : 
s
Invalid input ! Please enter a valid input.

*/

// This program is executed three times to explore all four cases for sucessful execution.

/*
My Observation : 
================
Works well, Enhancement is achieved like i desired.

*/