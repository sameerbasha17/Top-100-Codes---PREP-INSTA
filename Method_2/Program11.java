/* 
------------------------------------------------------------------------------------
Program No.   : 11
Program Title : Find the Reverse of a Number
Author        : Shaik Sameer Basha
Date Created  : 18-Oct-2025
Last Modified : 19-Oct-2025
IDE Used      : VS Code
Path          : Top-100-Codes---PREP-INSTA/Method_2/Program11.java
-------------------------------------------------------------------------------------

 ★ PS     : Find the Reverse of a Number in Java.
 ✩ Input  : A number.
 ✩ Output : A message that displays reverse of given number.
--------------------------------------------------------------------------------------
*/

// This method is not that much efficient one, but i have done this because i felt so enthusastic to work with Strings.

import java.util.Scanner;

public class Program11 
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        boolean flag = (number>0)?false : true;

        number = Math.abs(number);
        String S_number = Integer.toString(number);
    
        getReverse(S_number,flag,number);
        sc.close();
    }   

    static void getReverse(String S_number,boolean flag,int number)
    {
        String rev="" ; int num = 0;

        for(int i = S_number.length() -1  ; i >= 0 ; i--)
        {
            rev = rev + S_number.charAt(i);
        }

        num = Integer.parseInt(rev);

        int result = (flag)?-1*num : num;

        System.out.println("The reverse of "+number+" is : "+result);

    }
}

/* Output : 
============
Case - 1 :
----------
Enter a number : 
220608
The reverse of 220608 is : 806022

Case - 2 :
----------
Enter a number : 
-170601
The reverse of 170601 is : -106071

Case - 3 :
----------
Enter a number : 
000009
The reverse of 9 is : 9

*/

/*
My Observation :
-----------------
works well, but doesn't satisfy case - 3 correctly. So, i try to slove this in Method_3/Program11.java

*/