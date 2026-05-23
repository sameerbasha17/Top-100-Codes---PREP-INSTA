/* 
--------------------------------------------------------------------------------------------------------------
Program No.   : 19

 ★ PS     : Given an integer number as the input, the objective is the given number is strong number or not.
 ✩ Input  : A number.
 ✩ Output : To print whether it is a strong number or not.
--------------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Program19 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int digit = 0, num = number, result = 0;

        // Take the last digit from the number
        while(num != 0)
        {
            digit = num % 10;
            num = num / 10;
            result += factorial(digit);
        }
        
        if(result == number)
        {
            System.out.printf("%d is a strong number.",number);
        }
        else
        {
            System.out.printf("%d is not a strong number.", number);
        }

        sc.close();
    }

    static int factorial(int n)
    {
        int fact = 1;
        if(n == 0) return fact;
        
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        
        return fact;
    }
}

/*
Case - 1 :
----------
Enter a number : 
145
145 is a strong number.

Case - 2 :
----------
Enter a number : 
123
123 is not a strong number.
*/
