package casestudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailwithBooking {
	public static void main(String[] arg) throws IOException
	{
		String Name;
		String Address;
		String Number;
		String EmailID;
		String proofType;
		String proofID;
		String newEmailid;
		String bc;
		
		String startdate;
		String enddate;
		int id=0,roomno=0,sum=0, flag1=0,k=1;
		
		do
		{
		System.out.println("Registration");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter your Name:");
		Name= br.readLine();
		System.out.println("Enter your Address:");
		Address= br.readLine();
		System.out.println("Contact Number:");
		Number= br.readLine();
		System.out.println("E-Mail ID:");
		EmailID= br.readLine();
		System.out.println("Enter proof Type:");
		proofType= br.readLine();
		System.out.println("Enter proof ID:");
		proofID= br.readLine();
		for(int i=1; i<25; i++)
		{
			id=sum+i;
			flag1=1;
			break;
		}
		if(flag1==1)
		{
		System.out.println("Thankyou for registering.Your id is "+id);
		
		}
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String chr;
		System.out.println("Do you want to book a room (y/n)?)");
		chr=br.readLine();
		if(chr.equalsIgnoreCase("y"))
			{
				int booked[]=new int[100];
				for(int i=0; i<25; i++)
				{
					booked[i]=0;
				}
				System.out.println("Booking");
				int flag=0;
				String ac;
				String cot;
				String cable;
				String wifi;
				String laundry;
				String date;
				int total=0;
				System.out.println("\nBooking:");
				System.out.println("Please choose the services required");
				System.out.println("AC/non-AC(AC/nAC");
				ac=br.readLine();
				System.out.println("Cot(Single/Double");
				cot=br.readLine();
				System.out.println("With cable connection/without cable connection(C/nC)");
				cable=br.readLine();
				System.out.println("Wi-Fi needed or not(W/nW)");
				wifi=br.readLine();
				System.out.println("Laundry service needed or not(L/nL)");
				laundry=br.readLine();
				System.out.println("Enter the date of booking");
				date=br.readLine();
				
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
		else
		{
			System.out.println("Thank you");
		}
		System.out.println("Do you want to continue registration ?(y/n)");
		bc=br.readLine();
		}
while(bc.equalsIgnoreCase("y"));
		System.out.println("View all bookings:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the start date");
		startdate=br.readLine();
		System.out.println("\nEnter the end date");
		enddate=br.readLine();
		System.out.println("\nThe booking made from "+startdate+" to "+enddate+" are");
		System.out.println("Room number	custemer id");
		
		
	}
}
	


