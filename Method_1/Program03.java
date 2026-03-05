/* 
---------------------------------------------------------------------
Program No.   : 03
Program Title : Find the Sum of First N Natural Numbers in Java.
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program03.java
---------------------------------------------------------------------

 ★ PS     : Find the Sum of First N Natural Numbers in Java.
 ✩ Input  : a integer.
 ✩ Output : A message that prints the "sum" of "n" natural numbers.
----------------------------------------------------------------------
*/

// Method 01 : for - loop method 

import java.util.Scanner;

public class Program03 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int result = 0;
        for(int i = 1; i <= n; i++)                // Makes the time complexity O(n).
        {
            result += i;
        }
         
        System.out.printf("The sum of first %d natural numbers is %d%n",n,result);
        
        sc.close();
    }
}

/* Output : 
===========
Case - 1 :
----------
Enter n : 
9
The sum of first 9 natural numbers is 45

Case - 2 :
----------
Enter n : 
-17
The sum of first -17 natural numbers is 0   

*/

/* My Observation :
   ----------------
When non-natural number is given as input it prints sum as 0 . so, i want to improve the logic in better way .
so, that i have added non-natural number exception case and used "sum of N natural numbers" -> formula  in Method_2/Program03.java
*/
