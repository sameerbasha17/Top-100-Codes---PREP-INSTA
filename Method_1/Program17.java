/* 
----------------------------------------------------------------------------------------------------------------
Program No.   : 17
Program Title : Power of a number 
Author        : Shaik Sameer Basha
Date Created  : 26-Oct-2025
Last Modified : 26-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program17.java
-----------------------------------------------------------------------------------------------------------------

 ★ PS     : Given two integers as the number and power inputs, the objective is to raise the number input to the power input and print the value.
 ✩ Input  : Two numbers (one for number and another for power).
 ✩ Output : Print the power of given input.
------------------------------------------------------------------------------------------------------------------
*/

// using pow(base, exponent)


import java.util.Scanner;
public class Program17 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number input : ");
        double number = sc.nextDouble();
        System.out.println("Enter the power input : ");
        double power = sc.nextDouble();

        double result = Math.pow(number,power);

        System.out.printf("Output : %.2f",result);
        sc.close();
    }
    
}

/* Output : 
==========
Case - 1 :
----------
Enter the number input : 
7
Enter the power input : 
2
Output : 49.00

Case - 2 :
----------
Enter the number input : 
-7
Enter the power input : 
2
Output : 49.00

Case - 3 :
----------
Enter the number input : 
-7
Enter the power input : 
3
Output : -343.00

Case - 4 :
----------
Enter the number input : 
7
Enter the power input : 
-2
Output : 0.02

Case - 5 :
----------
Enter the number input : 
1
Enter the power input : 
2
Output : 1.00                      // Anything power zero is 1 . 

*/

/* My Observation :
==================
works nice, I have already used math.pow earlier... seems like i am connecting the inbuilt methods efficiently.
*/
