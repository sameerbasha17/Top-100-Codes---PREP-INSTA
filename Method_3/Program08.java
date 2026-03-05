/* 
------------------------------------------------------------------------------------
Program No.   : 08
Program Title : Check Whether a Given Number is Prime or Not
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_3/Program08.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether a Given Number is Prime or Not in Java.
 ✩ Input  : A number.
 ✩ Output : A message that prints given number is prime or not.
--------------------------------------------------------------------------------------
*/

// Here we use Math.sqrt(number) which is more optimized than number/2.

import java.util.Scanner;

public class Program08 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        checkPrime(number);
        
        sc.close();
    }  
    
    static void checkPrime(int num)
    {
        boolean flag = true;
        
        if(num < 2)
        {
            flag = false;
        }
        else
        {
            for(int i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
            System.out.printf("%d is a prime number.%n",num);
        else
            System.out.printf("%d is not a prime number.%n",num);

    }
    
}

/* Output :
 ===========

Case - 1 :
----------
Enter a number : 
9 
9 is not a prime number.

Case - 2 :
----------
Enter a number : 
17
17 is a prime number.

Case - 3 : 
-----------
Enter a number : 
-17
-17 is not a prime number.

Case - 4 :
----------
Enter a number : 
2
2 is a prime number.

*/

/*

My Observation :
----------------
The program was executed successfully.

*/
