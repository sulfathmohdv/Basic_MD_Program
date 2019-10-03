package assessment1;

import java.util.Scanner;

public class PowerDigit {
	public static void main(String[] arg)
	{
		int n,a,b;
		double sum=1,power;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			a=n%10;
			b=(n%100)/10;
			power=Math.pow(b,a);
			sum=sum+power;
			n=n/10;
		}
		System.out.println((int)sum);
	}

}
