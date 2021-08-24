package oopexercises;

public class BankAccount extends LoanAccount  implements Irate {
	// Define variables
	String accountNumber;
	
	// static>>belongs to the class not the objects instance
	// final >> constant (often static final)
	static final String routingNumber="193439";
	
	// Instance variables
	private String name;
	private String ssn;
	private String accountType;
	double balance;
	
	BankAccount(){
		System.out.println("New Account Created");
	}
	
	BankAccount(String a){
		System.out.println("New Account: "+a);
	}
	
	BankAccount(String accountType,double initDeposit){
		// initDeposit, account type, Msg are all local variables
		
		System.out.println("New Account : "+ accountType);
		System.out.println("Inital Deposit of : $"+ initDeposit);
		String Msg=null;
		if(initDeposit<1000) {
			Msg="Error: Minimum deposit must be at least $1000";
		}
		else {
			Msg="Thank you for your deposit";
		}
		System.out.println(Msg);
		balance=initDeposit;
	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setRate() {
		System.out.println("Setting Rate");
		
	}
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	
	// Define methods

	 public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	void checkBalance() {
		// TODO Auto-generated method stub
		 System.out.println("Balance : "+balance);
		
	}
	
	 void withdraw(double amount) {
		 balance=balance-amount;
		 showActivity("Withdraw");
	 }
	 
	 void deposit(double amount) {
		 balance=balance+amount;
		 showActivity("Deposit");
	 }
	 
	 void getStatus() {
		 
		
	 }
	 private void showActivity(String activity) {
		 System.out.println("Recent Transaction: "+activity);
		 System.out.println("New balance: "+ balance);
	 }
	 
	 @Override
	 public String toString() {
		 
		 return "[Name: "+name + ", Account"+ accountNumber + ",Routing number"+routingNumber+ " Balance: $" + balance+"]";
		 
	 }
	 

}
