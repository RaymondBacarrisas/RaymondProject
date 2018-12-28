package RaymondProjectNo1;

import java.util.Scanner;

public class class2 
{
	private int fibonaccival;
	public class2()
	{
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		fibonaccival = input;
		System.out.println(fibonacci(input));
	}
	public int fibonacci(int n)
	{
		if(n == 1)
		{
			return n;
		}
		
		return fibonacci(n - 1);
	}
}
