package exercicio1151;

import java.util.Scanner;

public class Exercicio1151 
{
    static long fibo(int n) 
    {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
 
 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) 
        {
            if (i==(n-1))
            {
                System.out.print(Exercicio1151.fibo(i));
            }
            else
            {
            System.out.print(Exercicio1151.fibo(i) + " ");
            }
        }
 
    }
 
}
