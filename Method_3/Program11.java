/* 
------------------------------------------------------------------------------------
Program No.   : 11
Program Title : Find the Reverse of a Number
Author        : Shaik Sameer Basha
Date Created  : 18-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_3/Program11.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Reverse of a Number in Java.
 ✩ Input  : A number.
 ✩ Output : A message that displays reverse of given number.
--------------------------------------------------------------------------------------
*/

// It's lengthy, but i am learning more deeper with "Strings".

import java.util.Scanner;

public class Program11 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = sc.nextLine();

        System.out.println("The reverse of "+ number + " is : "+getReverse(number));

        sc.close();
    }   

    static String getReverse(String number)
    {
        boolean flag = number.startsWith("-");
        if(flag)
        {
            number = number.substring(1);
        }

        String temp = "";
        for(int i = number.length()-1; i >= 0 ; i--)
        {
            temp += number.charAt(i);
        }

        temp = (flag)?("-"+temp): temp;
        return temp;
    }
}

/* Output :
============
Case - 1 :
----------
Enter a number : 
0804
The reverse of 0804 is : 4080

Case - 2 :
----------
Enter a number : 
00001
The reverse of 00001 is : 10000

Case - 3 :
----------
Enter a number : 
-00001
The reverse of -00001 is : -10000

Case - 4 :
----------
Enter a number : 
-0705
The reverse of -0705 is : -5070

*/


/* 
 
My Observation :
----------------
Works good... Look at the logic ! what type of code it is 😅 .

*/