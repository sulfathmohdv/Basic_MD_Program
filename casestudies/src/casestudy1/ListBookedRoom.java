package casestudy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListBookedRoom {

	public static int booked[]=new int[100];
	public static void main(String[] arg) throws NumberFormatException, IOException
	{
		int option;
		int booked[]=new int[100];
		for(int i=0; i<25; i++)
		{
			booked[i]=0;
		}
		System.out.println("1.Book");
		System.out.println("2.CheckStatus");
		System.out.println("3.exit");
		System.out.println("Choose your option");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		option=Integer.parseInt(br.readLine());
		switch(option)
		{
		case 1:	booking();
		break;
		case 2: //System.out.println("Enter room number")	;
		//int roomId=Integer.parseInt(br.readLine());
		CheckStatus();
		case 3: System.exit(0);
		}
	}

	private static void CheckStatus() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//String number;
		System.out.println("Enter room number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
			if(booked[number]>0)
			{
				System.out.println("Room number " +number+" is booked");
			}
			else
			{
				System.out.println("Room number " +number+" is not booked");
			}
	}

	private static void booking( ) throws IOException {
		
		// TODO Auto-generated method stub 
		int roomno=0,flag=0;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int total=0;
		System.out.println("\nBooking:");
		System.out.println("Please choose the services required");
		System.out.println("AC/non-AC(AC/nAC");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ac=br.readLine();
		System.out.println("Cot(Single/Double");
		cot=br.readLine();
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=br.readLine();
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=br.readLine();
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=br.readLine();
		
		if(ac.equalsIgnoreCase("AC"))
		{
			total=total+500;
		}
		else if(ac.equalsIgnoreCase("nAC"))
		{
			total=total+200;
			
		}
		else
		{
			ac="NULL";
		}
		
			if(cot.equalsIgnoreCase("Single"))
			{
				total=total+250;
			}
			else if(cot.equalsIgnoreCase("Double"))
			{
				total=total+150;
			}
			else
			{
				cot="NULL";
			}
				if (cable.equalsIgnoreCase("C"))
				{
					total=total+150;
				}
				else if(cable.equalsIgnoreCase("nC"))
				{
					total=total+0;
				}
				else
				{
					cable="NULL";
				}
					if(wifi.equalsIgnoreCase("W"))
					{
						total=total+300;
					}
					else if(wifi.equalsIgnoreCase("nW"))
					{
						total=total+0;
					}
					else
					{
						wifi="NULL";
					}			
						if(laundry.equalsIgnoreCase("L"))
						{
							total=total+400;
						}
						else if(laundry.equalsIgnoreCase("nL"))
						{
							total=total+0;
						}
						else
						{
							laundry="NULL";
						}
			System.out.println("The total cherge is:"+total);
			System.out.println("The service choosen are:");
			System.out.println(cot+"cot"+ac+"room");
			//System.out.println(cot);able.
			if(cable.equalsIgnoreCase("c"))
			{
				System.out.println("cable connection enebled");
			}
			else
			{
				System.out.println("cable connection disabled");
			}
			//System.out.println(cable);
			//System.out.println(wifi);
			if(wifi.equalsIgnoreCase("w"))
			{
				System.out.println("wifi enebled");
			}
			else
			{
				System.out.println("wifi disabled");
			}
			//System.out.println(laundry);
			if(laundry.equalsIgnoreCase("l"))
			{
				System.out.println("with laundry service");
			}
			else
			{
				System.out.println("without laundry service");
			}
			System.out.println("Do you want to proceed?(Yes/No):");
			String proceed=br.readLine();
			if(total>0 && proceed.equalsIgnoreCase("Yes"))
			{
				for(int i=0; i<25; i++)
				{
					if(booked[i]==0)
					{
						booked[i]=total;
						 roomno=i+1;
						 flag=1;
						 break;
					}
				}
				if(flag==1)
				{
				System.out.println("Thank you for booking.Your room number is:"+roomno+".");
				}
			}
			
	}

}
