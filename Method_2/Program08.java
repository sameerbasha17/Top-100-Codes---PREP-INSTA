/* 
------------------------------------------------------------------------------------
Program No.   : 08
Program Title : Check Whether a Given Number is Prime or Not
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program08.java
-------------------------------------------------------------------------------------

 ★ PS     : Check Whether a Given Number is Prime or Not in Java.
 ✩ Input  : A number.
 ✩ Output : A message that prints given number is prime or not.
--------------------------------------------------------------------------------------
*/


import java.util.Scanner;

public class Program08 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        prime(number);
        
        sc.close();
    }
    
    public static void prime(int number)
    {
        int count =0;
        if(number < 2)
        {
            count = 1;
        }
        else
        {
            for (int i = 2; i <= number/2 ; i++)
            {
                
                if(number % i == 0) 
                {
                    count ++;
                    break;
                }
            }
            
        }

        String result = (count > 0)? "is not a prime" : "is a prime";
        System.out.printf("%d is a %s number.%n",number,result);

        
    }
}

/* Output :
 
Case - 01 :
-----------
Enter a number : 
9
9 is a is not a prime number.

Case - 02 :
------------
Enter a number : 
17
17 is a is a prime number.

Case - 03 :
------------
Enter a number : 
-17
-17 is a is not a prime number.

*/

/*
My Observation :
----------------
The program was successfully executed. I have started using the for-loops. hehe...

*/
