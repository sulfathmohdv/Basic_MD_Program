package mark;

import java.util.Scanner;

public class MarkSorting {
	public static void main(String[] arg)
	{
		int n,temp,arr[]=new int [20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students");
		n =s.nextInt();
		System.out.println("Enter the height of the students");
		for(int i=0; i<n; i++)
		{
		arr[i]=s.nextInt();
		}
		for(int j=0; j<n; j++)
		{
			for(int k=j+1; k<n; k++)
			{
				if(arr[j]<arr[k])
				{
					 temp=arr[k];
					 arr[k]=arr[j];
					 arr[j]=temp;
				}
			}
		}
		System.out.println("The priority of marks:");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
