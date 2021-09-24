package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity;
	private  int defaultPasswordLength =10;
	private String alternateEmail;
	private String companySuffix ="aeycompany.com";
	
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED "+ this.firstName+ " " + this.lastName );
	     
		this.department = setDepartment();
		System.out.println("Department:" + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:" + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your email is:" +email );
	}


	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code:");
		Scanner in=new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice ==1)
		{ return "Sales";}
		else if(depChoice ==2) { return "Development";}
		else if(depChoice ==3) { return "Accounting";}
		else {return "none";}
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ5656536!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail =altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	 
	public String getAlternateEmail() 
	{
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	 public String showInfo() {
		 return "DISPLAY NAME:"+ firstName +"" + lastName +
				 "COMPANY EMAIL:" +email +
				 "MAILBOX CAPACITY :" + mailboxCapacity + "mb";
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
