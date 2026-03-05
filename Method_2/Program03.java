/* 
--------------------------------------------------------------------
Program No.   : 03
Program Title : Find the Sum of First N Natural Numbers in Java.
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program03.java
---------------------------------------------------------------------

 ★ PS     : Find the Sum of First N Natural Numbers in Java.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the "sum" of "n" natural numbers.
---------------------------------------------------------------------
*/
// Method 02 : Using the formula "sum of Nth term"

import java.util.Scanner;

public class Program03 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        if(!sc.hasNextInt())                      // if user enter other than a integer then it tiggers.
        {
            System.out.println("Invalid input ! Please enter a valid input.");
            sc.close();
            return;
        }
        
        int n = sc.nextInt();       
        if(n <=0)                               // If user enter the non-natural number then it tiggers.
        {
            System.out.printf("There are no natural numbers to sum upto %d. Therefore Sum = 0 ",n);
            sc.close();
            return;
        }    

        int result = n*(n+1)/2;             // runs in O(1) time complexity.
        System.out.printf("The sum of first %d natural numbers is : %d",n,result);
        
        sc.close();
    }

}
    
/* Output :
===========
Case - 1 :
----------
Enter n : 
9
The sum of first 9 natural numbers is : 45

Case - 2 :
----------
Enter n : 
-7
There are no natural numbers to sum upto -7. Therefore Sum = 0 

Case - 3 :
----------
Enter n : 
a
Invalid input ! Please enter a valid input.

*/

/* My Observation :
====================
The program is executing successfully. keep coding...
 */

