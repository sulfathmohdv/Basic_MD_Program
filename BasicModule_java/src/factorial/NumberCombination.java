package factorial;

import java.util.Scanner;

public class NumberCombination {
	public static void main(String[] arg)
	{
		int n,sum=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number alphabet in your name");
		n=s.nextInt();
		System.out.println("The number of combination is:");
		for(int i=1; i<=n; i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
		
	}

}
