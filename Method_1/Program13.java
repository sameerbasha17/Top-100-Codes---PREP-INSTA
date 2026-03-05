/* 
----------------------------------------------------------------------------------------------------------------
Program No.   : 13
Program Title : Check whether or Not the Number is an Armstrong Number in Java
Author        : Shaik Sameer Basha
Date Created  : 22-Oct-2025
Last Modified : 22-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program13.java
-----------------------------------------------------------------------------------------------------------------

 ★ PS     : Given an integer input the objective is to check whether or not the number is an Armstrong number.
 ✩ Input  : A number.
 ✩ Output : A message says the given number is Armstrong number or not.
------------------------------------------------------------------------------------------------------------------
*/

// Armstrong number => abcd = a^n + b^n + c^n + d^n

import java.util.Scanner;

public class Program13
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String str = sc.nextLine();

        int len = str.length();
        int number = Integer.parseInt(str);

        if(number < 0)
        {
            System.out.println("Armstrong numbers are only defined for non-negative integers.So, please enter a positive value.");
            sc.close();
            return;
        }

        int digit =0, sum = 0, num = number;
        while(number != 0)
        {
            digit = number % 10;     //123
            sum +=(int)Math.pow(digit,len);
            number /=10; 
        }

        if(sum == num)
        {
            System.out.printf("%d is a Armstrong number.",num);
        }
        else
        {
            System.out.printf("%d is not a Armstrong number.",num);
        }

        sc.close();
        
    }
}


/* Output :
============
Case - 1:
---------
Enter a number : 
409
409 is not a Armstrong number.

Case - 2 :
----------
Enter a number : 
2208
2208 is not a Armstrong number.

Case - 3 :
----------
Enter a number : 
9
9 is a Armstrong number.

Case - 4 :
----------
Enter a number : 
-7
Armstrong numbers are only defined for non-negative integers.So, please enter a positive value.

*/

/* My Observation :
===================
works well. I learnt Math.pow() method and also the interesting Armstrong number rule. It's increases my curosity to learn tricky problems like this...
*/