package q1_resume;

import java.util.Scanner;

public class ResumeCreating {

	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String Name=s.nextLine();
		int Age=s.nextInt();
		s.nextLine();
		String Degree=s.nextLine();
		String Branch=s.nextLine();
		String ContactNumber=s.nextLine();
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
		System.out.println("Degree:"+Degree);
		System.out.println("Branch:"+Branch);
		System.out.println("ContactNumber:"+ContactNumber);
		
	}
}
