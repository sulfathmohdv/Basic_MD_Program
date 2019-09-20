package fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] arg)
	{
		int num,count=0,sum[]=new int[100],a=0,b=1;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		for(int i=0; i<num; i++)
		{
		if(count!=num)
		{
		sum[i]=a+b;
		a=b;
		b=sum[i];
		count++;
		}
		System.out.println(sum[i]);
		}
	}

}
