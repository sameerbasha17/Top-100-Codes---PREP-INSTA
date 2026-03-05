import java.util.Scanner;

public class Pattern01
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();

        // print the pattern
        for(int k = 1; k <= n; k++)
        {
            for(int i = 1; i <= n - k; i++)
            {
                System.out.print(" ");
            }
            for(int i = 1; i <= (2 * k - 1); i++)
            {
                System.out.print("*");
            }
            for(int i = 1; i <= n - k; i++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i - 1; j ++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (n*2 - i * 2 + 1); j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= i - 1; j ++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}