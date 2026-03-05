/* 
------------------------------------------------------------------------------------
Program No.   : 06
Program Title : Find the Largest of the Three Numbers
Author        : Shaik Sameer Basha
Date Created  : 14-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_1/Program06.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Largest of the Three Numbers.
 ✩ Input  : Three Numbers.
 ✩ Output : A message that prints the "Greatest number among three given numbers".
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program06 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();
        System.out.println("Enter number 3 : ");
        int number3 = sc.nextInt();

        if(number1 == number2 && number2 == number3)
        {
            System.out.println("All three numbers are equal. Greatest will be "+number1);
        }
        else
        {
            int temp;
            if(number1 > number2)
            {
                temp = number1;
            }
            else
            {
                temp = number2;
            }
            if(temp < number3)
            {
                temp = number3;
            }
            System.out.printf("The Greatest of given three numbers i.e : %d, %d, %d is %d",number1,number2,number3,temp);
        }

        sc.close();
    }
    
}


/* Output :
============
case-1 :
--------
Enter number 1 : 
9
Enter number 2 : 
7
Enter number 3 : 
1
The Greatest of given three numbers i.e : 9, 7, 1 is 9

case-2 :
--------
Enter number 1 : 
143
Enter number 2 : 
143
Enter number 3 : 
143
All three numbers are equal. Greatest will be 143

*/

/*

My Observation :
=================
The program was executed successfully. I like this ... keep coding !
 */