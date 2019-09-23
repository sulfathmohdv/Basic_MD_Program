package eligible;

import java.util.Scanner;

public class EligiblePlayers {
	public static void main(String[] arg)
	{
		int n, min,arr[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of players");
		n=s.nextInt();
		System.out.println("Enter the number of fouls made by each player:");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		min=arr[0];
	for(int k=0; k<n; k++)
			{
				if(arr[k]<min)
				{
					min=arr[k];
				}
				
			}
	System.out.println(min);
	System.out.println();
	
	}
}

}
