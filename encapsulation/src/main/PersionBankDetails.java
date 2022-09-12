package main;

import java.math.BigInteger;

class AccountDetails{		// Create helper class AccountDetails. 
	public String name = "Sutharsan";  // Create local public variable.
	public String accountNumber = "908087654547";
	private int password;			// Create private local variable you cannot access out of the class
	private int upi;
	public int getPassword() {		// Create getter to get the variable value from out of the class. 
		return password;
	}
	public void setPassword(int password) { //Create set method to add new value to the variable from another class.
		this.password = password;
	}
	public int getUpi() {
		return upi;
	}
	public void setUpi(int upi) {
		this.upi = upi;
	}
}
public class PersionBankDetails {			// Create main class.
	public static void main(String[] args) {  // Main method
		 AccountDetails accountDetails = new AccountDetails();  // Create object for AccountDetails class to access their methods and variables. 
		 accountDetails.setPassword(12345678);					// Add new value to the private variable using object.
		 accountDetails.setUpi(3456);
		 System.out.println("Name: "+ accountDetails.name);		// Print the variable values.
		 System.out.println("Account Number: "+accountDetails.accountNumber);
		 System.out.println("Password: "+ accountDetails.getPassword());
		 System.out.println("UPI: "+ accountDetails.getUpi());		 
	}	
} // End of class.
