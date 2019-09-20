package count;

import java.util.Scanner;

public class RetestCount {
public static void main(String[] arg)
{
	int n,count=0,arr[]=new int [20];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of students");
	n=s.nextInt();
	System.out.println("Enter the mark of the students");
	for(int i=0; i<n; i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("The number of students appearing for retest is:");
	for(int j=0; j<n; j++)
	{
	if(arr[j]<50||arr[j]==0)	
	{
		count++;
	}
	}
	System.out.println(count);
}
}
