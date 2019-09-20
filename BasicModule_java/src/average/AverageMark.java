package average;

import java.util.Scanner;

public class AverageMark {
	public static void main(String[] arg)
	{
		int n,sum=0,arr[]=new int [20];
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=s.nextInt();
		System.out.println("Enter the mark of students");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("The average mark of students is:");
		for(int j=0; j<n; j++)
		{
			sum=sum+arr[j];
		} 
			avg=(float)sum/n;
		System.out.println(avg);
	}
	

}
