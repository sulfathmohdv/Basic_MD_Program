package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailRegistraion {
	public static void main(String[] arg) throws IOException
	{
		String Name;
		String Address;
		String Number;
		String EmailID;
		String proofType;
		String proofID;
		String newEmailid;
		String chr;
		int id=0,sum=0,flag=0,z=1,j=0;
		String arr[]=new String[20];
		
		do
		{
		System.out.println("Registration");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter your Name:");
		Name= br.readLine();
		arr[j]=Name;
		j++;
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
			id++;
			flag=1;
			break;
		}
		if(flag==1)
		System.out.println("Thankyou for registering.Your id is "+id);
		System.out.println("Do you want continue registration ?(y/n)");
		chr=br.readLine();
		}
		while(chr.equalsIgnoreCase("y"));
		
		System.out.println("custemer lis");
		System.out.println("The registerd custemers are ");
		System.out.println("custemer id 	custmer name");
		for(j=0; j<id; j++)
		System.out.println((j+1)+" \t "+arr[j]);
		
	
	}

}
