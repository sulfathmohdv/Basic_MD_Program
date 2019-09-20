package bowlers;

import java.util.Scanner;

public class EligibleBowlers {
	public static void main(String[] arg)
	{
		int n,i,j,k,arr1[]=new int [20],arr2[]=new int[20],count=0;
		float arr[]=new float [20],sum=0,avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		n=s.nextInt();
		System.out.println("Enter the runs cancelled by the bowlers");
		for(i=0; i<n; i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter the number of balls for each bowlers");
		for(j=0; j<n; j++)
		{
			arr2[j]=s.nextInt();
		}
		for( k=0; k<n; k++)
				{
					arr[k]=(float)arr1[i]/(arr2[j]/6);
					System.out.println(arr[k]);	
				}
		for(int l=0; l<n; l++ )
		{
			sum=sum+arr[k];
			if(arr[l]<6)
			{
				count++;
			}
		}
	
	avg=sum/n;
	System.out.println(avg);
	System.out.println(count);
	
	
	}
}