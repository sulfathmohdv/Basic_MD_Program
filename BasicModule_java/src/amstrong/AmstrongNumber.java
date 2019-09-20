package amstrong;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static  void main(String[] arg)
	{
		
		Scanner s=new Scanner(System.in);
		int num,rem,temp,power,sum=0,count=0;
		num=s.nextInt();
		temp=num;
		int n=num;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		while(num!=0)
		{
			rem=num%10;
			power=(int) Math.pow(rem,count);
			sum=sum+power;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("The given number is amstrong");
			
		}
		else {
			System.out.println("The number is not amstrong");
		}
		
		
	}
	
	
	

}
