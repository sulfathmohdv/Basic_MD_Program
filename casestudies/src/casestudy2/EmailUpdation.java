package casestudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailUpdation {
	public static void main(String[] arg) throws IOException
	{
		String Name;
		String Address;
		String Number;
		String EmailID;
		String proofType;
		String proofID;
		String newEmailid;
		int id=0,sum=0,flag=0;
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
			flag=1;
			break;
		}
		if(flag==1)
		{
		System.out.println("Thankyou for registering.Your id is "+id);
		}
		String chr;
		System.out.println("Do you want continue registration ?(y/n)");
		chr=br.readLine();
		if(chr.equalsIgnoreCase("y"))
		{
		String ch;
		System.out.println("Do you want to update email id ?(y/n)");
		ch=br.readLine();
		if(ch.equalsIgnoreCase("y"))
		{
			System.out.println("Update email: ");                                                                  
			System.out.println("Enter new email id");  
			   newEmailid=br.readLine();
			   System.out.println("Email updated");
			   System.out.println("Your details are as follows");
			   System.out.println("Name:"+Name);
			   System.out.println("Address:"+Address);
			   System.out.println("Contact Number"+Number);
			   System.out.println("Email ID:"+newEmailid);
			   System.out.println("proof Type:"+proofType);
			   System.out.println("Enter proof ID:"+proofID);
		}
		else
		{
			System.out.println("Email updated");
			   System.out.println("Your details are as follows");
			   System.out.println("Name:"+Name);
			   System.out.println("Address:"+Address);
			   System.out.println("Contact Number"+Number);
			   System.out.println("Email ID:"+EmailID);
			   System.out.println("proof Type:"+proofType);
			   System.out.println("Enter proof ID:"+proofID);
		}
		}
		else
		{
			System.out.println("Email updated");
			   System.out.println("Your details are as follows");
			   System.out.println("Name:"+Name);
			   System.out.println("Address:"+Address);
			   System.out.println("Contact Number"+Number);
			   System.out.println("Email ID:"+EmailID);
			   System.out.println("proof Type:"+proofType);
			   System.out.println("Enter proof ID:"+proofID);
		}
		
	}

}
