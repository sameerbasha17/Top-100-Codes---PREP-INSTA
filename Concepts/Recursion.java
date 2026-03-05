// Recursion concept

public class Recursion
{
    public static void main(String [] args)
    {
        int n = 2;
        abc (n);
    }   

    static void abc(int n)
    {
        System.out.println(n);
        if(n > 0)
        {
            abc(n-1);
        }
        System.out.println(n);
    }
}

/*
Output :
========
2
1
0
0
1
2

*/
