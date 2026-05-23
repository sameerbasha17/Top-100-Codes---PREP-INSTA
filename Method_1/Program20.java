/* 
--------------------------------------------------------------------------------------------------------------
Program No.   : 20
 ★ PS     : Given an integer input as the number, the objective is to check whether or not the number can be
            represented as the sum of its factors except the number itself
 ✩ Input  : A number.
 ✩ Output : To print whether it is a Perfect number or not.
--------------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;
public class Program20 
{

    public boolean isPerfect(int n)
    {
        if(n <= 1)
            return false;
        
        int sum = 1;
        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                if(i == (n/i))
                {
                    sum += i;
                }
                else{
                    sum += i + (n/i);
                }
            }
        }
        return sum == n;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        Program20 p = new Program20();
        if(p.isPerfect(n))
            System.out.print(n + " is a perfect number.");
        else
            System.out.print(n + " is not a perfect number.");

        sc.close();
    }
}

/*
Output :
========
Case - 1 :
----------
Enter a number : 6
6 is a perfect number.

Case - 2 :
----------
Enter a number : 100
100 is not a perfect number.

*/