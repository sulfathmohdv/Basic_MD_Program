package winning;

import java.util.Scanner;

public class WinningBid {
	public static void main(String[] arg)
	{
		int n, max,arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of application");
		n=s.nextInt();
		System.out.println("Enter the amount:");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		max=arr[0];
	for(int k=0; k<n; k++)
			{
				if(arr[k]>max)
				{
					max=arr[k];
				}
			}
	System.out.println(max);
	}
}