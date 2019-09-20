package leapyear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] arg)
	{
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		year=s.nextInt();
		if(year%4==0)
				{
				if(year%100==0)
					{
						if(year%400==0)
						{
							System.out.println("The year is leapyear");
						}
						else
						{
							System.out.println("The year is not leapyear");
						}
					}
				else 
					{
						System.out.println("The year is leapyear");
						
					}
				}
			else
				{
					System.out.println("The year is not leapyear");
					
				}
			}
				
	}
